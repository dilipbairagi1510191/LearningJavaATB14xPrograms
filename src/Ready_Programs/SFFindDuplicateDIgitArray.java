package Ready_Programs;

public class SFFindDuplicateDIgitArray {
    public static void main(String[] args) {

        int a[]= {3,6,4,3,4,9,6};

        for(int i=0; i<a.length; i++){

            for(int j=i+1; j<a.length; j++ ){

                if(a[i] == a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
