package Ready_Programs;

import java.util.Arrays;
import java.util.Collections;

public class UsortElementsinArrayUsingBuiltMethods {
    public static void main(String[] args) {

        //Approch 1
    /*    int a[]={30,10,40,20,50};
        System.out.println("Before sorting :"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting :" +Arrays.toString(a));
  */

   /*     //Approch 2
        int a[]={50,25,30,10,60};
        System.out.println("Before sorting :"+Arrays.toString(a));
        Arrays.sort(a);
      System.out.println("After sorting :"+Arrays.toString(a));
*/

        //reverse in decending order
        Integer a[]={80,10,60,20,90,60};
        System.out.println("Before sorting :"+Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Before sorting :"+Arrays.toString(a));



    }
}
