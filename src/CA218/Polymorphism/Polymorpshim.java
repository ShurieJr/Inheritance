package CA218.Polymorphism;

public class Polymorpshim {
   protected int age;

    //constructor
    Polymorpshim(){
        age = 28;
    }
    Polymorpshim(int age){
        this.age = age;
    }


   protected void display(){
        System.out.println(age);
    }
    void display(int age){
        System.out.println("age=" + age);
    }
}
