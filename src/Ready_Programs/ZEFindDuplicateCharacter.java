package Ready_Programs;

public class ZEFindDuplicateCharacter {
    public static void main(String[] args) {

        String str="Automation";
        char []ch =str.toCharArray();
        int count=0;

        for(int i=0; i<ch.length;i++){
            for(int j=i+1; j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("duplicate chacater in string are:"+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("Duplicate character count:"+count);
    }
}
