package ex_24_Collections_set;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        //declaration

        HashMap <Integer,String> hm=new <Integer,String> HashMap();
        hm.put(101, "dilip");
        hm.put(102,  "Mona");
        hm.put(103,  "Harshu");
        hm.put(101,  "Shyam");

        System.out.println(hm);

        System.out.println("Size of hashmap:"+hm.size()); //three pair 3

        //remove pair
        hm.remove(102);
        System.out.println("After removing pair"+hm);

        //access value of key
        System.out.println(hm.get(103));

        //get all the key from hashmap
        System.out.println(hm.keySet()); //[101, 103]
        System.out.println(hm.values()); //[Shyam, Harshu]
        System.out.println(hm.entrySet()); //[101=Shyam, 103=Harshu]

        //reading data from hashmap

        for(int m:hm.keySet())
        {
            System.out.println(m+"          "+hm.get(m));
        }






    }
}
