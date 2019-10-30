package mythingy

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello World," + CompanionMain.name)
  }

}

object CompanionMain {

  val name = "Gaurav"
}
