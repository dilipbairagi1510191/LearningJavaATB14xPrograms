package Ready_Programs;

public class A_Swap_Two_number {
    public static void main(String[]args)

    {
        int a=10, b=20;

/*
        System.out.println("Before swape a :"+a);
        System.out.println("Before swape b :"+b);

        //using thrid variable
        int c=a;
        a=b;
        b=c;


        System.out.println("Before swape a:"+a);
        System.out.println("Before swape b:"+b);

*/
//  without using third variable

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swaping value are .."+a+"   "+b);





    }
}
