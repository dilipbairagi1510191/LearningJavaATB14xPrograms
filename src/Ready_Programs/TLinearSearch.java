package Ready_Programs;

public class TLinearSearch {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        int search_ele=30;
        boolean status=false;

        for(int i=0; i<a.length;i++)
        {
            if(search_ele==a[i])
                System.out.println("find the element at:"+i);
            status=true;
        }
        if(status=false)
        {
            System.out.println("element not found");
        }


    }
}
