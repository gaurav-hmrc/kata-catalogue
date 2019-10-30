package mythingy

import org.scalatest.{Matchers, WordSpec}


class FibonacciSpec extends WordSpec with Matchers {

  "calling getFibonacci" should {

    "return an seq of integers in fibonacci series 1"  in {

      Fibonacci.getFibonacci(1) shouldBe List(1)

    }

    "return an seq of integers in fibonacci series 2"  in {

      Fibonacci.getFibonacci(2) shouldBe List(1, 1)

    }

    "return an seq of integers in fibonacci series 3"  in {

      Fibonacci.getFibonacci(3) shouldBe List(1, 1, 2)

    }

    "return an seq of integers in fibonacci series 4"  in {

      Fibonacci.getFibonacci(4) shouldBe List(1, 1, 2, 3)

    }

    "return an seq of integers in fibonacci series 10"  in {

      Fibonacci.getFibonacci(60) shouldBe List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

    }

    "return an seq of integers in fibonacci series 6"  in {

      Fibonacci.fib3(6) shouldBe 8

    }

    "return an seq of integers in fibonacci series lsi of 10"  in {

      Fibonacci.fibList(10) shouldBe List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

    }

    "return an seq of integers in fibonacci series 7"  in {

      Fibonacci.simpleFib(7) shouldBe List(1, 1, 2, 3, 5, 8, 13)

    }

  }

}
