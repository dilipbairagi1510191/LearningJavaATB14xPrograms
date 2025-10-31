package Ready_Programs;

public class C_Reverse_String {
    public static void main(String[] args) {

        String str ="ABCD";
        String rev="";

       /* int len=str.length();

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
     */

        //Using StringBuffer

        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
