package mythingy

import org.scalatest.{Matchers, WordSpec}

class StringProcessingSpec extends WordSpec with Matchers {

  "calling process string" should {

    "return an string of digits for alphanumeric string" in {
      StringProcessing.processString("abcd1234") shouldBe 10
    }

    "return 0 for string without digits" in {
      StringProcessing.processString("abcd") shouldBe 0
    }

    "return 0 for empty string" in {
      StringProcessing.processString("") shouldBe 0
    }
  }

}
