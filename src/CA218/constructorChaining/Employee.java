package CA218.constructorChaining;

public class Employee extends Person{
    //constructors
    Employee(String st){
        System.out.println(st);
    }
    Employee(){
        this("Employee Constructor with parameters");
        System.out.println("Employee constructor without parameters");
    }
}
