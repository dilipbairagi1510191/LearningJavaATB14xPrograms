package Opps;
//Polymorphism = One name, many forms
//Two types:
//👉 Method Overloading (Compile time)
//👉 Method Overriding (Runtime)

//A. Method Overloading Example

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class PolymorphismMehodOverloading {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(5,10));
        System.out.println(c.add(5,10,20));

    }

}

//Explanation:
//Both methods have the same name (add) but different parameters.
//Java decides which one to call based on arguments → this is compile-time polymorphism.
