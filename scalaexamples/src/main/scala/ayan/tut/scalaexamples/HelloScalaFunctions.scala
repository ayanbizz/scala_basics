package ayan.tut.scalaexamples
/*@Author:ayan biswas
 * */
object HelloScalaFunctions {
  def main(args:Array[String]){
    var objectLst=List("Cat","Rose","Dog","Elephant");
    def animalTraverse{
      for (i<-0 until objectLst.length){
        if(i==1)
          return // similar to break in java
        println(objectLst(i));
      }
     
    }
    animalTraverse// simple call to the method
    consoleIO
  }
  
  def consoleIO(){
    print ("Type Something")
    var input= readLine
    println(s"you entered ${input}")
  }
}