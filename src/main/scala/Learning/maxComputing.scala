package Learning


class maxComputing {
  /*
    Implementation of approaches for max value of list calculation
   */

  def max(xs: List[Int]): Int = {
    def max0(acc: Int, xs: List[Int]): Int = {
      if (xs.isEmpty) acc else max0(math.max(acc, xs.head), xs.tail)
    }

    max0(xs.head, xs.tail)

  }

  def max2(xs: List[Int]): Int = {
    if (xs.isEmpty) 0 else
      xs.reduceLeft(
        (a: Int, b: Int) => if (a > b) a else b
      )
  }

  def max3(xs: List[Int]): Int = {
    val f = (a: Int, b: Int) => a max b
    xs.reduceLeft(f)
  }
}

