package Ready_Programs;

public class OPrintEvenOddNumfromArrayEnhanceloop {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};
        System.out.println("This is even number");

        //Enhanced for loop
        for(int value:a)
        {
            if(value%2==0)
                System.out.println(value);
        }

        System.out.println("This is odd number");

        for(int value:a)
        {
            if(value%2!=0)
                System.out.println(value);
        }
    }
}
