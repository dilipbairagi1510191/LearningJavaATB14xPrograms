package Ready_Programs;

import java.util.Scanner;

public class B_Reverse_Number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");

        int num=sc.nextInt();

        /* (1)
        int rev=0;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num= num/10;
        }
        System.out.println("Reverse number is "+rev);
         */


        /*
        //(2) Using String Buffer

        StringBuffer sb=new StringBuffer(String.valueOf(num));  
        StringBuffer rev=sb.reverse();

        System.out.println("Reverse number is "+rev);
       */

        //(3) Using String Builder

        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);


    }
}
