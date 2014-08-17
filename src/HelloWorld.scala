/**
 * Created by toshiba on 2014/8/9.
 *
 * Study for scala first day
 * @author sundan
 *
 */
object HelloWorld {
   def main (args: Array[String]) {
    println("HelloWorld.scala");
//     println(foc(10));
//     print( max(1,3));
//     greeting();
     testarray();
  }

  def foc(x:BigInt):BigInt =
  if (x== 0 ) 1 else x*foc(x-1);

  // test function
  def max(x:Int,y:Int): Int ={
    if(x > y)x
    else y
  }
  // test return Unit
  def greeting() {
    println("test void");
  }

  // test Array and for, foreach
  def testarray(): Unit ={
    val numName =  Array("zero","one"); // ==>val numName =  Array.apply("zero","one");
    val greeting = new Array[String](3);
    greeting(0) = "HelloWorld.scala";// ==> greeting.update(0,"HelloWorld.scala")
    greeting(1) = "This is new World!";
    greeting(2) = "what's up!";

    println("test1 \n");
    for(i <- 0 to 2){
      println(greeting(i))
    }
    println("test2 \n");
    for(i <- 0 to greeting.length -1){
      println(greeting(i)) // greeting(i) ==> greeting.apply(i)
    }
    println("testForeach1")
    println();
    greeting.foreach(println)
    println("testForeach2")
    println();
    greeting.foreach(greet =>println(greet))
    println("testForeach3")
    println();
    greeting.foreach((greet:String) =>println(greet))

    print(numName.mkString("\n"))
  }
}
