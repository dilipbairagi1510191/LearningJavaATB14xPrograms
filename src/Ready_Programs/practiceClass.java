package Ready_Programs;

import java.util.Scanner;

public class practiceClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();

        int even_count=0;
        int odd_count=0;

        while(num!=0)
        {
            int val=num%10;

                if (val%2==0)
                {
                    even_count++;
            }
            else
            {

                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Even number"+even_count);
        System.out.println("Odd count"+odd_count);
    }
}
