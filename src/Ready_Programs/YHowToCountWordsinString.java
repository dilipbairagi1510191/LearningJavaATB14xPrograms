package Ready_Programs;

import java.util.Scanner;

public class YHowToCountWordsinString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the your input");
        String input=sc.nextLine();

        int count=1;

        for(int i=0; i<input.length()-1;i++)
        {
            if((input.charAt(i)==' ') && (input.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("number of word :"+count);

    }
}
