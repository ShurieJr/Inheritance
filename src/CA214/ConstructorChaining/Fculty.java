package CA214.ConstructorChaining;

public class Fculty extends Employee{ //extends Employee class
    //constructor
    Fculty(){
        System.out.println("Faculty Constructor!");
        super.display();
        super.age = 60;
        System.out.println(super.age);
    }

    //method -- override display
     void display() {
        System.out.println("Display Faculty information!");
    }
}
