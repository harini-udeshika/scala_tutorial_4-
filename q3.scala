import scala.io.StdIn.readInt

object q4 extends App {
  println("Enter a number: ")
  var num: Int=readInt()
  def matchInt(num :Int)=num match {
    case 0=>"zero"
    case num if(num<0)=>"negative"
    case num if (num%2==0)=>"even"
    case _ =>"odd"
  }
  println(matchInt(num))

}
