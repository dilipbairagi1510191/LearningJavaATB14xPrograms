package Ready_Programs;

public class F_Count_NumberOfDigits {
    public static void main(String[] args) {

        int num=12345;
        int count=0;

        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("Number of digit:"+count);
    }
}
