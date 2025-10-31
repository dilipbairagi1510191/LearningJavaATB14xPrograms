package Ready_Programs;

public class ZAHowToReverseEachWordinaString {
    public static void main(String[] args) {

       /*
        String str="Welcome to java";
        String []words=str.split(" ");
        String reverseString="";

        for(String w:words)
        {
            String reversWords="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reversWords=reversWords+w.charAt(i);
            }
            reverseString=reverseString+reversWords+" ";
        }
        System.out.println(reverseString);
    */

        //2nd approch
        String str="Welcome to java";
        String [] words=str.split("\\s");
        String reversWords="";

        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reversWords=reversWords+sb.toString()+" ";
        }

        System.out.println(reversWords);

    }

}
