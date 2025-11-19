package ex_24_Collections_set2Peamos;

import java.util.LinkedList;
import java.util.List;

public class LAB236_LL_List {
    public static void main(String[] args) {
        LinkedList mylist=new LinkedList();

        mylist.add("Prmod");
        mylist.add("Dtta");
        mylist.add("Amit");

        System.out.println(mylist.peek());
        System.out.println(mylist);
        System.out.println(mylist.pop());
        System.out.println(mylist);
    }
}
