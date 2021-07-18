import scala.io.StdIn.readInt

object FibonacciSeq extends App{

    def fibonacci(x:Int):Any = {
        if(x>0) fibonacci(x-1)
        print(fibSeq(x)+ " ")
    }

    def fibSeq(x:Int):Int =x match{
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => fibSeq(x-1)+fibSeq(x-2)
    }

    print("Enter the Number:");
    val n = readInt()
    print("Result :");
    fibonacci(n)
}
