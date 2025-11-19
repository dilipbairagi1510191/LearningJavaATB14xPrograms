package ex_24_Collections_set2Peamos;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo22 {
    public static void main(String[] args) {


        ArrayList marks=new ArrayList();

        marks.add(80);
        marks.add(90);
        marks.add(55);
        marks.add(65);


        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);



    }
}
