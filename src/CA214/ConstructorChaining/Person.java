package CA214.ConstructorChaining;

public class Person {  //parent
    Person(){
        this("Person Constructor (Parametrized)!");
        System.out.println("Person Constructor (No argument)!");
    }
    Person(String p){
        System.out.println(p);
    }
}
