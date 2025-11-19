package ComparableVSComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_Compare {
    public static void main(String[] args) {

        Employee e1=new Employee(3, "Amit");
        Employee e2=new Employee(1, "Pramod");
        Employee e3=new Employee(5, "Datta");

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " _ " + name;
    }

        public String printDetails()
        {
            return id + " _ " + name;
        }
        @Override
        public int compareTo(Employee o) {
        //return this.id-o.id;
            return this.name.compareTo(o.name);
    }
}









