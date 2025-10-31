package ex_21_Inhertance;

import Ready_Programs.UsortElementsinArrayUsingBuiltMethods;
import org.w3c.dom.ls.LSOutput;

class parent
{
   void display(int a)
   {
       System.out.println(a);
   }
}

class child1 extends parent
{
     void show(int b)
     {
         System.out.println(b);
     }
}

class child2 extends parent
{
    void print(int c)
    {
        System.out.println(c);
    }
}
public class HierarcyInhertance {
    public static void main(String[] args) {

        child1 ch1 = new child1();

        ch1.display(100);
        ch1.show(200);


        child2 ch2 = new child2();

        ch2.display(1000);
        ch2.print(2000);
    }
}