package Ready_Programs;

public class XHowToCountOccurrencesofaCharacterinaString {
    public static void main(String[] args) {
        //How many times 'a' occurr in below strings

        String s="Java Programining Java oops";

        int total_count=s.length(); //total length of string
        System.out.println(total_count);

        int after_remove_a=s.replace("i","").length(); //total length after remove a
        System.out.println(after_remove_a);

        int count=total_count-after_remove_a;
        System.out.println("total count occurance of A:"+count);





    }
}
