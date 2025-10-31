package ex_20_StaticKey;

public class StaticDemo {

    static int a=10;
    int b=20;

    static void m1()
    {
        System.out.println("This is m1 static method");
    }

    void m2()
    {
        System.out.println("This is me non static method");
    }




    public static void main(String[] args) {

        //1) static methods can access static stuff directly (without objec)
        System.out.println(a);
        m1();

       // System.out.println(b);  //can not access , b is non-static
        //m2();

    }
}
