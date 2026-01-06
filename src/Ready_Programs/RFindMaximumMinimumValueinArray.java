package Ready_Programs;

public class RFindMaximumMinimumValueinArray {
    public static void main(String[] args) {

        int a[]={10,200,300,40,50,60,70};

        int max=a[0];
        int min=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];

            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Maximu array mumber is:"+max);
        System.out.println("Maximu array mumber is:"+min);


    }
}
