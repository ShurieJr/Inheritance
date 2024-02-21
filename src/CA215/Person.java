package CA215;

public class Person {  //parent class
    //variables
   private String name;
  private  int age;
    //constructors
    Person(){
//        name = "Mohamed abdullahi";
//        age = 70;
        this("Mohamed abdullahi" , 70);
    }
    Person(String name , int age){
        this.name =  name ;
        this.age  =  age ;
    }


    //methods
    void display(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age );
    }
}
