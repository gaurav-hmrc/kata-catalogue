package mythingy

object PrimeNumber {

  def checkPrime(i: Int): String = {

    i match {
      case 1  => "Odd"
      case _ if(i%2 == 0) => "Even"
      case _ if(!(3 until i).exists(x => i%x == 0)) => "Prime"
      case _  => "Odd"
    }

  }

  def determineOddEvenPrime = {

    println(List(1, 2, 3) :: List(4, 5, 6))
    println(List(1, 2, 3) :+ 4)
    println(List(1, 2, 3) :+ 4)

    for(x <- 1 to 100) {
      val checkPrimeString = checkPrime(x)
      println(s"$x -> $checkPrimeString")
    }

  }

}
