package Ready_Programs;

public class VRemoveJunkSpecialCharactersinString {
    public static void main(String[] args) {

        String s="!@#$% testing Selenium 01234";
        s=s.replaceAll("[^a-zA-Z,0-9]","");
        System.out.println(s);
    }
}
