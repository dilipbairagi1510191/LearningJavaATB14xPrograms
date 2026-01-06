package Ready_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SFSortArrayAsdDcdOrder {
    public static void main(String[] args) {

        //why we use this *Integer* Because Collections.reverseOrder() works ONLY with objects, not with primitive types.
       //✔️ Integer → Object (Wrapper class)
        //❌ int → Primitive type


        Integer a[]= {80,40,90,10,70};

        System.out.println("before sorting:"+ Arrays.toString(a));

        //Accendig order
        Arrays.sort(a);
        System.out.println("after sorting:"+ Arrays.toString(a));

        //Decending ording
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After decending order"+Arrays.toString(a));
    }
}
