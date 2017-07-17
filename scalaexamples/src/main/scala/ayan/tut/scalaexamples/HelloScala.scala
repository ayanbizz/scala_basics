

package ayan.tut.scalaexamples
import scala.math._
object HelloScala {
  def main(args: Array[String]): Unit = {
    //valAndVar()
    basicMathsInScala()
  }
  def valAndVar():Unit ={
    //variables are declared using var keyword::mutable in nature
    var x=8
    print(x)
    x=9
    print (x)
    //final values are declared using val keyword::immutable in nature
    val y =10
    print (y)
  }
  def basicMathsInScala(){
    val tau=Pi *2
    println(s"value of tau is $tau")
    printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))  

  }
}