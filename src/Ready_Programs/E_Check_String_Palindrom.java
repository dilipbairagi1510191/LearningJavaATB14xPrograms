package Ready_Programs;

import java.util.Scanner;

public class E_Check_String_Palindrom {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.next();

        String orignal_str=str;
        String rev="";

        int len=str.length();

        for(int i=len-1;i>=0; i--)
        {
            rev=rev+str.charAt(i);
        }
        if(orignal_str.equals(rev))
        {
            System.out.println(orignal_str+":String is palindrom");
        }
        else
        {
            System.out.println(orignal_str+":String is not palindrom");
        }
    }
}
