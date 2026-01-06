package Ready_Programs;

import java.util.Arrays;

public class SFSortArrayWithoutUsinBuilt {
    public static void main(String[] args) {

        int a[]={4,3,2,1};
/*
        for (int i=0; i<a.length; i++){

            for (int j=i+1; j<a.length; j++){

                if (a[i] > a[j]){     //decending order we need to change like if (a[i] < a[j])

                    int temp = a[i];

                    a[i] = a[j];
                    a[j] = temp;


                }
            }
        } */
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
