package Learning

import scala.io.Source

class ReadFile {

  def readFileNaive(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }

    else Console.err.println("File name was not entered")
  }

  def widthOfString(s: String): Int = {
    s.length.toString.length
  }

  def readFileFormatOutput(args: Array[String]): Unit = {
    if (args(0).length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList

      // simple approach
      var maxWidth = 0
      for (line <- lines)
        maxWidth = maxWidth.max(widthOfString(line))

      // good approach
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )

      var maxWidth2 = widthOfString(longestLine)

      for (line <- lines) {
        val numSpaces = maxWidth2 - widthOfString(line)
        val padding = " " * numSpaces
        println(padding + line)
      }
    }
    else
      Console.err.println("Pls enter filename")


  }
}
