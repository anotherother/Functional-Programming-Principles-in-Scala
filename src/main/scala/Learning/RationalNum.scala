package Learning

/*
In this task we will be implement rational number class
 */

class RationalNum(n: Int, d: Int) {
  require(d != 0) // If not true will be generated IllegalArgumentException

  private val g = gcd(n.abs: Int, d.abs: Int)

  val numer: Int = n
  val denumer: Int = d

  def this(n: Int) = this(n, 1) // Additional constructor

  override def toString: String = n + "/" + d

  def +(that: RationalNum): RationalNum =
    new RationalNum(
      that.numer * denumer + that.denumer * numer,
      that.denumer * denumer
    )

  def +(i: Int): RationalNum =
    new RationalNum(
      numer + i * denumer, denumer
    )

  def -(that: RationalNum): RationalNum =
    new RationalNum(
      that.numer * denumer - that.denumer * numer,
      that.denumer * denumer
    )

  def -(i: Int): RationalNum =
    new RationalNum(
      numer - i * denumer, denumer
    )

  def *(that: RationalNum): RationalNum =
    new RationalNum(
      that.numer * numer, that.denumer * denumer
    )

  def *(i: Int): RationalNum =
    new RationalNum(
      numer * i, denumer
    )

  def /(that: RationalNum): RationalNum =
    new RationalNum(
      numer * that.denumer, that.numer * denumer
    )

  def /(i: Int): RationalNum =
    new RationalNum(
      numer, denumer * i
    )

  def lessThan(that: RationalNum): Boolean =
    numer * that.denumer < that.numer * denumer

  def max(that: RationalNum): RationalNum =
    if (lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

