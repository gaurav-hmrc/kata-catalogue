package mythingy


object Fibonacci {

  // 1,1,2,3,5,8,13,21,34

  def getFibonacci(num: Int): List[Int] = {

  fibonaccis(num, 1, 1)

  }

  private def fibonaccis(max: Int, prev: Int, prevPrev: Int): List[Int] =

  prev >= max match {
    case true => List[Int](prevPrev)
    case false => prevPrev :: fibonaccis(max, prev + prevPrev, prev)
  }


  def fib3(n: Int): Int = {

    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fib_tail(n-1, b, a + b)
    }

    return fib_tail(n, 0 , 1)
  }

  def fibList(n: Int): List[Int] = {

    def fib_tail(n: Int, a: Int, b: Int, c: List[Int]): List[Int] = n match {
      case 0 => c
      case _ => println(c :+ b)
        fib_tail(n-1, b, a + b, c :+ b)
    }

    return fib_tail(n, 0 , 1, List[Int](0))
  }

  def simpleFib(n: Int): List[Int] = {

    var first = 0
    var second = 1
    var acc = List[Int]()

    for(i <- 1 to n) {
      val sum = first +  second
      first = second
      second = sum
      acc = acc ++ List(first)
    }


    return acc

  }


}
