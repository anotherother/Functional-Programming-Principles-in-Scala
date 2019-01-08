package Learning

object sqrtComputing {

  def abs(x: Double): Double = if (x < 0) -x else x

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double = {
      if (isGoodEnougth(guess)) guess
      else sqrtIter(improve(guess))
    }

    def isGoodEnougth(guess: Double): Boolean =
      abs(guess * guess - x) < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(guess = 1.0)
  }

  def main(args: Array[String]): Unit = {
    println(sqrt(5))
  }
}
