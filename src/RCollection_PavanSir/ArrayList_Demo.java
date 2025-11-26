package RCollection_PavanSir;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {

        //want to store only number in arraylist
        //ArrayList <Integer> al=new ArrayList <Integer>() ;
        //ArrayList <String> st=new ArrayList <String>();

        ArrayList al=new ArrayList();

        //Add element in arrayList

        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al);

        //how much element in arrayList
        System.out.println(al.size());

        //remove
        System.out.println(al.remove(1));


    }
}
