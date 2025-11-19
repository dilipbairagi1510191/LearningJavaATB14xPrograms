package ex_24_Collections_set2Peamos;

import java.util.ArrayList;

public class ListDemoP {
    public static void main(String[] args) {


        ArrayList Arrays=new ArrayList();
        Arrays.add("1");
        Arrays.add("1");
        Arrays.add("2");
        Arrays.add(1);
        Arrays.add("Dilip");
        Arrays.add("Bairagi");

        System.out.println(Arrays);
        System.out.println(Arrays.contains(1));

        for(int i=0;i<Arrays.size();i++ )
        {
            System.out.println(Arrays.get(i));
        }
    }
}
