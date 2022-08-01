import scala.io.StdIn

object q1 extends App{
  def interest(m :Double)={

    if(m>2000000){m*0.065}
    else if(m>200000){m*0.035}
    else if(m>20000){m*0.04}
    else{m*0.02}
  }
  println("Enter your deposit amount: ")
  val money=StdIn.readDouble()
  println("Interest per year: "+interest(money))
}
