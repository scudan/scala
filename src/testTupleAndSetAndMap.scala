/**
 * Created by toshiba on 2014/8/11.
 */
import scala.collection.mutable.Set;
//import scala.collection.mutable.Map;

object testTupleAndSetAndMap {

  def main(args: Array[String]) {
    //testTuple();
    //testSet();
    //testMap();
    testFunc();
      }
  //test Tuple
  def testTuple(): Unit ={
    val pair =(99,"Test"); // different type in tuple
    println(pair._1); //
    println(pair._2);
  }
  // test Set
  // mutable and immutale
  def testSet(): Unit ={
    var jetSet = Set("beijing","shanghai");
    jetSet+="shenzhen"; // add new node
    println(jetSet);
    // Set(beijing, shanghai, shenzhen)

    val movieSet = Set("beijing","shanghai");
    movieSet+="shenzhen"; // import scala.collection.mutable.Set;
    println(jetSet);//
  }


  //test Map

  def testMap(): Unit ={
//    val treeMap = Map[Int,String]();
//    treeMap +=(1 -> "hello");
//    treeMap +=(2 -> "new ");
//    treeMap +=(3 -> "world!");
//    println(treeMap(2));
    val immutableMap = Map(1->"one",2->"two");
    print(immutableMap(2))
  }
  def forMatArgs(args: Array[String]) =args.mkString("\n");

  def testFunc(): Unit ={
    val res = forMatArgs(Array("1","2","3"));
    assert( res == "1\n2\n3");
    println(res);
  }
}
