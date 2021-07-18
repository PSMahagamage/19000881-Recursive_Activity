import scala.io.StdIn.readInt

object AddEven extends App{

    def Even(x:Int):Boolean = {
        if(x%2==0) true else false
    }

    def sum(x:Int):Int = x match {
        case 2 => x
        case y if(Even(x)) =>  x+sum(x-1)
        case _ => sum(x-1)
    }

    print("Enter the Number:");
    val n = readInt()
    print("Result :" + sum(n-1));
}
