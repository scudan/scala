/**
 * Created by toshiba on 2014/8/10.
 */
object TestList {

  def main(args: Array[String]) {
    testList();
  }

  //test List
  /*
  * List con't be changed after be created
   *
   */
  def testList(): Unit ={
    val l1 = List(1,2,4);
    val l2 = List(3,5);
    val l3 = l1:::l2;
    val l4 = l2::l1;
    val l5 = 10::l2;
    println("l1 is "+(l1)+" and l2 is "+(l2));
    //output: l1 is List(1, 2, 4) and l2 is List(3, 5)
    println("thus l2 is "+(l3)+" and l4 is "+(l4)+" and l5 is "+(l5))
    //output: thus l2 is List(1, 2, 4, 3, 5) and l4 is List(List(3, 5), 1, 2, 4)
    // and l5 is List(10, 3, 5)
    val l6 = 1::2::3::Nil;
    println(l6)
    //List(1, 2, 3)
  }
}
