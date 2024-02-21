package CA215;

public class Student extends Person{  //child -> person
    //variables
    String stdID ;
    //const
    Student(){
        stdID = "C112160";
    }
    Student(String name , int age , String stdID){
        //call parent constructor
        super(name , age);
        this.stdID = stdID;
    }



    //method
    void display(){   //overriding
        System.out.println("Student ID: " + stdID);
        super.display();
    }
}
