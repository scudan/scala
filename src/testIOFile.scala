/**
 * Created by toshiba on 2014/8/16.
 */
import scala.io.Source;
object testIOFile {
  def widthOfLength(s : String) = s.length.toString.length;

  def main (args: Array[String]) {
    //if(args.length > 0){
    val lines =  Source.fromFile("D:\\CÓïÑÔÑ§Ï°\\scalaSpace\\src\\testIOFile.scala").getLines.toList;
    val longestLine = lines.reduceLeft(
      (a,b) => if(a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)
      for(line <- lines){
        val numSpace = maxWidth-widthOfLength(line);
        val padding = "" * numSpace;

        println(padding+line.length+" | "+line);
      }
   // }
//    else {
//      Console.err.println("Please enter filename");
//    }

  }





}
