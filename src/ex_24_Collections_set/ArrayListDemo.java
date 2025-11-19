package ex_24_Collections_set;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        //declaration
        ArrayList mylist=new ArrayList();
        //List mylist=new ArrayList();

       // ArrayList <Integer>mylist=new ArrayList<Integer>();
        //ArrayList <String>mylist1=new ArrayList<String>();

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        //size of array list
        System.out.println("Size of array list:"+mylist.size());

        //printing data from arraylist
        System.out.println("printing data from arraylist:"+mylist);

        //remove element form array list
        mylist.remove(5);
        System.out.println("printing data from arraylist:"+mylist);

       //add element in mid of the array
        mylist.add(2,"Java");
        System.out.println("printing data from arraylist:"+mylist);

        //modify/replace/change the arraylist
        mylist.set(2,"Paytho");
        System.out.println("printing data from arraylist:"+mylist);

        //get the specific element
        System.out.println(mylist.get(3));

        //reading all the data from array list
        //using normal for loop
/*
        for(int i=0;i<mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }
*/
        //using for each
/*
        for(Object x:mylist)
        {
            System.out.println(x);
       }
 */

        //using itrrator

        Iterator it=mylist.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //checking array list is empty or not
        System.out.println("array list emtpty or not:"+mylist.isEmpty());


        //remove random few element from array list
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);
        mylist2.add("Welcome");

        mylist.removeAll(mylist2);
        System.out.println("after remvoming multiple element:"+mylist);



    }
}
