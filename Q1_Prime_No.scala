import scala.io.StdIn.readInt

object Prime_No extends App{

    def gcd(x:Int, y:Int):Int = y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def prime(a:Int, n:Int=2):Boolean = n match{
        case x if(a==x) => true
        case x if(gcd(a,x)>1) => false
        case x => prime(a,x+1)
    }

    print("Enter the Number:");
    val n = readInt()
    print("Result :" + prime(n));
}
