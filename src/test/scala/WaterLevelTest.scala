import WaterLevel.getMaxVolume
import org.scalatest._


class WaterLevelTest extends FlatSpec with Matchers {

  "Waterlevel function" should "pass the example" in {
    val inp = List(1, 8, 6, 2, 5, 4, 8, 3, 7)
    getMaxVolume(inp) should be (49)
  }
}
