package Ready_Programs;

public class GCountNumberOfEVENODDDigits {
    public static void main(String[] args) {

        int num = 1233445;
        int even_count = 0;
        int odd_count = 0;

        while (num > 0)
        {
            int val = num % 10;
            if (val % 2 == 0)

            {
                even_count++;
            } else {
                odd_count++;
            }
            num = num / 10;
        }
        System.out.println("count of even number:" + even_count);
        System.out.println("count of odd number:" + odd_count);
    }
}