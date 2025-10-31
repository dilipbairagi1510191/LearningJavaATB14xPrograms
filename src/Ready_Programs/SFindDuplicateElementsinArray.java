package Ready_Programs;

public class SFindDuplicateElementsinArray {
    public static void main(String[] args) {

        String arr[]={"java","Selenium","Paython","c","c++","c"};
        boolean flag=false;

        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("found duplicate element"+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("duplicate element not found");
        }
    }
}
