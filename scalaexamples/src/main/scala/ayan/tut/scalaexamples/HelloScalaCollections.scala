package ayan.tut.scalaexamples

object HelloScalaCollections {
  def main (args :Array[String]){
    val immutableMap=Map("King"->"John Snow", "Queen"->"Daneyrys")
    val mutableMap=collection.mutable.Map(101->"Tony Stark",102->"Arya Stark")
    var temp=immutableMap("King")
    println(temp)
    mutableMap(103)="Ned Stark"//possible as this is a mutable map
    //immutableMap("WiseMan")="Tyrion"//compilation error
    for((k,v)<-mutableMap){
      println(s"key ${k} value ${v}")
    }
  }
}