package mythingy

import org.scalatest.{Matchers, WordSpec}

class FizzBuzzSpec extends WordSpec with Matchers{

  "calling fizzBuzz" should {

    "return the number string" in {
      FizzBuzz.getFizzBuzz(1) shouldBe "1"
    }

    "return Fizz if number is divisible by 3" in {
      FizzBuzz.getFizzBuzz(3) shouldBe "Fizz"
    }

    "return Fizz if number is divisible by 3 - test" in {
      FizzBuzz.getFizzBuzz(9) shouldBe "Fizz"
    }

    "return Buzz if number is divisible by 5" in {
      FizzBuzz.getFizzBuzz(10) shouldBe "Buzz"
    }

    "return FizzBuzz if number is divisible by 3 and 5" in {
      FizzBuzz.getFizzBuzz(15) shouldBe "FizzBuzz"
    }

  }

}
