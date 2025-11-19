package ex_23_interface;

interface Shape
{
    int length=10;  //final and static variable
    int width=20;


void circle();  //abstract method no implimitation

default void square()
   {
       System.out.println(" This is interface - this is default method");
   }

   static void rectangle()
   {
       System.out.println("This is static method");
   }

}

public class interfaceDemo implements Shape
{
    public void circle()
    {
        System.out.println("this is circle");
    }
    public static void main(String[] args) {

        //interfaceDemo idobj=new interfaceDemo();
        //idobj.circle(); //abstract method
       // idobj.square();  //default
        //Shape.rectangle();  //static method can directly access from interface

        Shape sh=new interfaceDemo();
        sh.circle(); //abstract
        sh.square(); //default
        Shape.rectangle(); //static method can directly access from interface
    }
}
