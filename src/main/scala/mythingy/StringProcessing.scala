package mythingy


object StringProcessing {
  def processString(s: String): Int = {

    val digits = List("0","1","2","3","4","5","6","7","8","9")

    s.filter(x => digits.contains(x.toString)).map(
      y => Integer.parseInt(y.toString)
    ).sum

  }

}
