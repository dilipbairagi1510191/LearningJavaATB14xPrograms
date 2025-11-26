package RCollection_PavanSir;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo2 {
    public static void main(String[] args) {


        ArrayList ar=new ArrayList();
        ar.add(20);
        ar.add(40);
        ar.add(10);
        ar.add(50);

        System.out.println(ar);
        Collections.sort(ar);
        System.out.println("After sorting"+ar);



    }
}
