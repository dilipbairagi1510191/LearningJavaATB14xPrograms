package ex_22_Overriding;

class test1
{
     void m()
    {
        System.out.println("This is method from Test1...");
    }
}

class test2 extends test1//incorrect,bcoz test1() is final class method
{
  //void m()//incorrect,bcoz m() is final method
    {
        System.out.println("This is m method from Test2...");
    }
}

public class FinalMethod2 {
    public static void main(String[] args) {

    }
}
