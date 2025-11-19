package ex_24_Collections_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet myset=new HashSet();
        //Set myset=new HashSet();
        // HashSet<String> myset=new <String> HashSet();

        //adding element in to hasset
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(true);
        myset.add('A');

        myset.add(100);
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //printing the hasset data
        System.out.println(myset);

        //remove element
        myset.remove(10.5);
        System.out.println("After removing"+myset);

        //inserting element  no possible
        myset.add("Dilip");
        System.out.println("after insert"+myset);

        //inserting element  no possible
        //Access specific element -not possible

        //Convert Hashset ---> Arraylist
        ArrayList a1=new ArrayList(myset);
        System.out.println(a1);
        System.out.println(a1.get(2));

        //read all the element using inhance for loop
        for(Object m:myset)
        {
            System.out.println(m);
        }


        //using ittrator
        Iterator <Object>it=myset.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
