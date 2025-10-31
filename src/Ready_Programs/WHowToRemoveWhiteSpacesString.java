package Ready_Programs;

public class WHowToRemoveWhiteSpacesString {
    public static void main(String[] args) {

        String s="Java   programining  in         Selenium";

        System.out.println("Before removing the spance :"+s);
        s=s.replaceAll("\\s","");
        System.out.println("after removing the spance :"+s);

    }
}
