package Opps;

class Animal1{
    void Sound(){
        System.out.println("Animal makes sounds");
    }
}
class Cat extends Animal1{
    void Sound(){
        System.out.println("Cat bark");
    }
}
public class PolymorphismMethodOverriding {
    public static void main(String[] args) {

        Animal1 a=new Cat();
        a.Sound();
    }
}
//Real use in testing:
//In frameworks, you can use overriding to define common methods (like click() or sendKeys()) in a base class and modify behavior in child classes (like MobilePage, WebPage).