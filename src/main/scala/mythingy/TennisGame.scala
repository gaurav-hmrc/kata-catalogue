package mythingy

object TennisGame {

  def getResult(player1Score: Int, player2Score: Int): String = {

    val isBothPlayersHaveMin3Points = player1Score >= 3 && player2Score >= 3
    val isAtleastOnePlayersHave4Points = player1Score >=4 || player2Score >= 4
    val absPointsDiff = Math.abs(player1Score - player2Score)

    (isBothPlayersHaveMin3Points, isAtleastOnePlayersHave4Points, absPointsDiff) match {

      case (true, _, 0) => "deuce"
      case (true, _, 1) => if(player1Score > player2Score) "advantage player 1" else "advantage player 2"
      case (_, true, 2) => if(player1Score > player2Score) "player 1 won" else "player 2 won"
      case _ => getScore(player1Score) + "-" + getScore(player2Score)

    }

  }


  def getScore(i: Int): String = {

    i match {
      case 0 => "love"
      case 1 => "fifteen"
      case 2 => "thirty"
      case 3 => "forty"
      case _ => throw new Exception("Invalid scores")
    }

  }



}
