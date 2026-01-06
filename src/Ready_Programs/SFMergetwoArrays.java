package Ready_Programs;

import java.util.Arrays;

public class SFMergetwoArrays {
    public static void main(String[] args) {

        int a[] ={1,2,3};
        int b[] ={4,5,6};

        int c[]= new int[a.length + b.length]; //3 + 3= 6

        for(int i=0; i<a.length; i++){
            c[i]=a[i];
            //{1,2,3,4,5,6}
        }
        for(int i=0; i<b.length; i++){
            c[i + a.length]=b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
