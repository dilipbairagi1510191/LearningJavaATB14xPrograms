package Opps;

// Step 1: make data private (hidden)
class Student{
    private String name;

    // Step 2: provide public setter to set data
    public void setName(String n){
            name=n;
    }

    // Step 3: provide public getter to read data
    public String getName(){
            return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Dilip");
        System.out.println(s1.getName());

    }
}
