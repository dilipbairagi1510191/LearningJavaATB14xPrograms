package Ready_Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZBHowToReadDataFromTextFile {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("C:\\Users\\dilip\\Inverviw data\\TestData.txt.txt");
        Scanner sc=new Scanner(file);

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}
