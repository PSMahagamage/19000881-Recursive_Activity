import scala.io.StdIn.readInt

object EvenOrOdd extends App{

    def Even(x:Int):Boolean = x match{
        case 0 => true
        case _ => Odd(x-1)
    }

    def Odd(x:Int):Boolean = !Even(x)

    print("Enter the Number:");
    val n = readInt()
    print("It's a even number:" + Even(n));
}
