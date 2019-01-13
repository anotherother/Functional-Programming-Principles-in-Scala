package Learning

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object GenerateException extends App{

  try{
    val v = new FileReader("filename.txt")
  }
  catch {
    case ex: FileNotFoundException => println("File was not found")
    case ex: IOException => println("IO Exception")
  }



}
