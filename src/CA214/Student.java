package CA214;

public class Student extends Person{  //child class -- (person)
String stid;
    Student (){
    stid = "C112160";
    }
    Student (String name , int age , String address , String stid){
        //invoke superclass constructor
        super(name , age , address);
        this.stid = stid;
    }

    public void display(){  //overriding
        System.out.println(stid);
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.address);
       // super.display();  //invoke superclass method
    }
}


