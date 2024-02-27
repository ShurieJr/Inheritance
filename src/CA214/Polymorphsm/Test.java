package CA214.Polymorphsm;

public class Test {
 protected int age;
 int id;  //default

    //constructor
//    Test(){
//        age = 23;
//        id = 100;
//    }
    public Test(){
        this.age = age;
    }

    //methods
   public void display(){
        System.out.println("age: " + age);
    }
//overloading   methods
    public void display(int age){
        System.out.println("age: " + age);
    }
}
