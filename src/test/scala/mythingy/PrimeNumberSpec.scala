package mythingy

import org.scalatest.{Matchers, WordSpec}

class PrimeNumberSpec  extends WordSpec with Matchers {

  "calling checkPrime" should {

    "return Odd for odd number 1" in {

      PrimeNumber.checkPrime(1) shouldBe "Odd"

    }

    "return Even for number 2" in {

      PrimeNumber.checkPrime(2) shouldBe "Even"

    }

    "return Prime for number 3" in {

      PrimeNumber.checkPrime(3) shouldBe "Prime"

    }

    "return Even for number 100" in {

      PrimeNumber.checkPrime(100) shouldBe "Even"

    }

    "return Odd for number 9" in {

      PrimeNumber.checkPrime(9) shouldBe "Odd"

    }


    "return Prime for number 7" in {

      PrimeNumber.checkPrime(7) shouldBe "Prime"

    }

  }

  "calling determineOddEvenPrime" should {

    PrimeNumber.determineOddEvenPrime

  }

}
