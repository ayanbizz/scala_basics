package ayan.tut.scalaexamples

object HelloScalaTut2 {
  
 def main(args:Array[String]){
   forLoopVariation()
 }
 def forLoopVariation(){
   for (x<-1 to 10 ){
     println(x)
   }
   var randomStr="ABCDEFGHIJ"
   for(x<-0 until randomStr.length()){
     println(randomStr(x))
   }
   /*The output of a for loop is directly stored in a variable(mutable) via yield*/
   var evenNos=for{i<-0 to 20
     if(i%2 == 0)
   } yield i // 
   for(i<-0 to evenNos.length -1){
     println("evenNos["+i+"]"+evenNos(i))
   }
 }
}