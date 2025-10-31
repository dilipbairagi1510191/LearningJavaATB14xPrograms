package Ready_Programs;

import java.util.Scanner;

public class D_Check_Number_Palindrom {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();

        int Orinal_num=num;

        int rev=0;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(Orinal_num==rev)
        {
            System.out.println("This is palidrom numner");
        }
        else
        {
            System.out.println("it is not palidrom number");
        }


    }
}
