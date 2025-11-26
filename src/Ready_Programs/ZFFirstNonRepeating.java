package Ready_Programs;

public class ZFFirstNonRepeating {
    public static void main(String[] args) {

        String str="aabbcddee";
        char[] chr= str.toCharArray();

        for(int i=0; i<chr.length;i++){
            boolean isRepeating= false;

            for(int j=0; j<str.length();j++){
                if(i!=j && chr[i]==chr[j]){
                    isRepeating=true;
                    break;
                }
            }
            if(!isRepeating){
                System.out.println("First Non-Repeating Character: " + chr[i]);
                return;
            }
        }
        System.out.println("No non-repeating character found");
    }
}
