import WaterLevel.getMaxVolume
import org.scalatest._


class WaterLevelTest extends FlatSpec with Matchers {

  "Waterlevel function" should "pass the example" in {
    val inp = List(1, 8, 6, 2, 5, 4, 8, 3, 7)
    getMaxVolume(inp) should be(49)
  }

  "Waterlevel function" should "work for two values" in {
    val inp = List(3, 2)
    getMaxVolume(inp) should be(2)
  }

  "Waterlevel function" should "throw IllegalArgumentException for empty list" in {
    val inp = List()
    assertThrows[IllegalArgumentException](getMaxVolume(inp))
  }

  "Waterlevel function" should "throw IllegalArgumentException for list with a single element" in {
    val inp = List(1)
    assertThrows[IllegalArgumentException](getMaxVolume(inp))
  }

  "Waterlevel function" should "work for solution from start to end" in {
    val inp = List(1, 1, 1, 1)
    getMaxVolume(inp) should be(3)
  }

  "Waterlevel function" should "throw IllegalArgumentException for list with negative numbers" in {
    val inp = List(1, -1, 1, 1)
    assertThrows[IllegalArgumentException](getMaxVolume(inp))
  }

  "Waterlevel function" should "work for no container" in {
    val inp = List(0, 0, 0, 0, 0)
    getMaxVolume(inp) should be(0)
  }

}
