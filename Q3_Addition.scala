import scala.io.StdIn.readInt

object Addition extends App{

    def sum(x:Int):Int = {
        if(x==1)
        {
            return 1;
        }
        else
        {
            x+sum(x-1);
        }
    }

    print("Enter the Number:");
    val n = readInt()
    print("Result :" + sum(n));
}
