import scala.io.StdIn.readInt

object Prime_Seq extends App{

    def gcd(x:Int, y:Int):Int = y match{
        case 0 => x
        case y if(y>x) => gcd(y,x)
        case _ => gcd(y,x%y)
    }

    def prime(a:Int, b:Int=2):Boolean = b match{
        case x if(a==x) => true
        case x if(gcd(a,x)>1) => false
        case x => prime(a,x+1)
    }

    def primeSeq(b:Int):Unit = {
        if(b>1){
            primeSeq(b-1)
            if(prime(b)){
                print(b + " ")
            }
        }
    }

    print("Enter the Number:");
    val n = readInt()
    primeSeq(n);

}
