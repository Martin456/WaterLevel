import scala.annotation.tailrec

object WaterLevel {
  def main(args: Array[String]) = {
    println("Hi!")


    val inp = List(1, 8, 6, 2, 5, 4, 8, 3, 7)
    println(getMaxVolume(inp))

    val inp2 = List(1, 1, 6, 6, 1, 1)
    println(getMaxVolume(inp2))

  }

  def getMaxVolume(inp: List[Int]): Int = {
    if(inp.length < 2) throw new IllegalArgumentException("Input list contains less than two elements")
    else if (inp.exists(_ < 0)) throw new IllegalArgumentException("Input list contains negative numbers")
    else {
      @tailrec
      def recVolumeCalculation(input: List[Int], length: Int, maxVol: Int): Int = {
        if (length == 0) maxVol
        else {
          val volumes = for {
            x <- 0 until input.length
            if input.length > x + length
          } yield calculateVolume(input(x), input(x + length), length)
          val newMax = volumes.max
          if (newMax >= maxVol) recVolumeCalculation(input, length - 1, newMax)
          else recVolumeCalculation(input, length - 1, maxVol)
        }
      }

      def calculateVolume(x: Int, y: Int, length: Int): Int = Math.min(x, y) * length

      recVolumeCalculation(inp, inp.length - 1, 0)
    }
  }


}