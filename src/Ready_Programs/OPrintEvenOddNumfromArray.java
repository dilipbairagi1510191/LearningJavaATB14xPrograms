package Ready_Programs;

public class OPrintEvenOddNumfromArray {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};

        System.out.println("This is even number");

        for(int i=0; i<a.length;i++)
        {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
        System.out.println("This is odd number");

        for(int i=0;i<a.length;i++)

            if(a[i]%2!=0)
                System.out.println(a[i]);


    }
}
