package CA218;

public class Person {  //parent class - superclass
    //variables
    public int age;
    public String name;
    //constructors
    Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    Person(){
        this.age = 23;
        this.name = "ahmed";
    }
    //methods
    public void display(){
        System.out.println(age + " " + name);
    }
}
