package mythingy

import org.scalatest.{Matchers, WordSpec}


class TennisGameSpec extends WordSpec with Matchers {

  // 0, 1, 2, 3

  "calling getScore" should {

    "return love for 0 score" in {

      TennisGame.getScore(0) shouldBe "love"

    }

    "return love for 1 score" in {

      TennisGame.getScore(1) shouldBe "fifteen"

    }

    "return love for 2 score" in {

      TennisGame.getScore(2) shouldBe "thirty"

    }

    "return love for 3 score" in {

      TennisGame.getScore(3) shouldBe "forty"

    }

    "return exception for 5 score" in {

      intercept[Exception] {
        TennisGame.getScore(5)
      }

    }

  }

  "calling getResult" should {

    "return the status of the match for match scores 3 and 2" in {

      TennisGame.getResult(3, 2) shouldBe "forty-thirty"
    }

    "return the status of the match for match scores 2 and 2" in {

      TennisGame.getResult(2, 2) shouldBe "thirty-thirty"
    }

    "return the status of the match for match scores 3 and 3" in {

      TennisGame.getResult(3, 3) shouldBe "deuce"
    }

    "return the status of the match for match scores 4 and 4" in {

      TennisGame.getResult(4, 4) shouldBe "deuce"
    }

    "return the status of the match for match scores 5 and 5" in {

      TennisGame.getResult(5, 5) shouldBe "deuce"
    }

    "return the status of the match for match scores 6 and 5" in {

      TennisGame.getResult(6, 5) shouldBe "advantage player 1"
    }

    "return the status of the match for match scores 26 and 25" in {

      TennisGame.getResult(26, 25) shouldBe "advantage player 1"
    }

    "return the status of the match for match scores 9 and 10" in {

      TennisGame.getResult(9, 10) shouldBe "advantage player 2"
    }

    "return the status of the match for match scores 4 and 2" in {

      TennisGame.getResult(4, 2) shouldBe "player 1 won"
    }

    "return the status of the match for match scores 2 and 4" in {

      TennisGame.getResult(2, 4) shouldBe "player 2 won"
    }

    "return the status of the match for match scores 8 and 6" in {

      TennisGame.getResult(8, 6) shouldBe "player 1 won"
    }

    "return the status of the match for match scores 16 and 18" in {

      TennisGame.getResult(16, 18) shouldBe "player 2 won"
    }

    "return the status of the match invalid scores" in {

      intercept[Exception] {
        TennisGame.getResult(16, 19)
      }
    }

  }

}
