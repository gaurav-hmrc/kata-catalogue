package mythingy

object CaclStats {

  def getMaxValue(integerSeq: Seq[Int]): Int = {

    integerSeq.reduce(_ max _)

  }

  def getMinValue(integerSeq: Seq[Int]): Int = {

    integerSeq.reduce(_ min _)

  }

  def getSum(integerSeq: Seq[Int]): Int = {

    integerSeq.reduce(_ + _)

  }

  def getElements(integerSeq: Seq[Int]): Int = {

    integerSeq.size

  }

  def getAvg(integerSeq: Seq[Int]): Double = {

    getSum(integerSeq).toDouble/getElements(integerSeq)

  }

}
