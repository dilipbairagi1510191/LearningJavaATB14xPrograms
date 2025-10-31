package Ready_Programs;

public class QFindMissingNumberinanArray {
    public static void main(String[] args) {

        int a[]={1,2,4,5};
        int sum1=0;

        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("S1 array total count is:"+sum1);

        int sum2=0;
        for(int i=0;i<=5;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("S2 array total count is:"+sum2);
        System.out.println("Missing array digit is :"+(sum2-sum1));
    }
}
