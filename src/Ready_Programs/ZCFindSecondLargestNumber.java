package Ready_Programs;

public class ZCFindSecondLargestNumber {
    public static void main(String[] args) {

        int []a= {20,42,60,25,30,88};

        int max1=20;
        int max2=42;

        if(a[0] > a[1])
        {
            max1=a[0];
            max2=a[1];
        }
        else
        {
            max1=a[1];
            max2=a[0];
        }
        // Step 2: Loop from index 2
        for(int i=2; i<a.length; i++)
        {
            if(a[i] > max1)
            {
                max2=max1;
                max1=a[i];
            } else if (a[i] > max2 && a[i] !=max1) {
                max2=a[i];
                
            }
        }
        System.out.println("Largest number :"+max1);
        System.out.println("Second largest number :"+max2);
      }
    }


