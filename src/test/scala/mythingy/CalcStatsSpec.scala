package mythingy

import org.scalatest.{Matchers, WordSpec}


class CalcStatsSpec extends WordSpec with Matchers {

  val integerSeq = Seq(6, 9, 15, -2, 92, 11)

  "stats method" should {

    "return maximum integer value" in {

      CaclStats.getMaxValue(integerSeq) shouldBe 92

    }

    "return minimum integer value" in {

      CaclStats.getMinValue(integerSeq) shouldBe -2

    }

    "return sum of all integers" in {

      CaclStats.getSum(integerSeq) shouldBe 131

    }

    "return number of elements" in {

      CaclStats.getElements(integerSeq) shouldBe 6

    }

    "return average" in {

      CaclStats.getAvg(integerSeq) shouldBe 21.833333333333332

    }

  }

}
