import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    String name;
    int sal;

    Employee(String name, int sal){
        this.name = name;
        this.sal = sal;
    }

    public int compareTo(Employee e){
        return Integer.compare(this.sal,e.sal);
    }

     public String toString() {
	    	return  "["+name+","+sal+"]";
	    }
}


public class EmployeeSort{
    public static void main(String[] args) {
        Employee e1 = new Employee("Sriram", 20000);
        Employee e2 = new Employee("Manjunath", 30000);
        Employee e3 = new Employee("Gireesh", 40000);
        Employee e4 = new Employee("Pavan", 10000);

        ArrayList<Employee> employees  = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Collections.sort(employees);
        System.out.println(employees);

    }
}