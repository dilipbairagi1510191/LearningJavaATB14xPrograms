package Ready_Programs;

public class ZDCountVowelsConsonants {
    public static void main(String[] args) {

        String str="Automation testing to java";
        str=str.toLowerCase();

        int vowels=0;
        int constant=0;

        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);


            if(ch>='a' &&  ch<='z'){   //ch >= 'a'   → ch >= 97  ch <= 'z'   → ch <= 122 Characters in Java have ASCII/Unicode values 'a' to 'z' are lowercase English letters.
                if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'|| ch=='u'){
                    vowels++;
                }
                else {
                    constant++;
                }
            }
        }
        System.out.println("vovel:"+vowels);
        System.out.println("constant:"+constant);
    }
}
