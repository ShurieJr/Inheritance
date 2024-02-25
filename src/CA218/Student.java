package CA218;


public class Student extends Person{
    String stdID;
      public Student(String name, int age, String id){
        super(age , name); //call parent class constructor
        stdID = id;
    }
    Student(){
        System.out.println("Student constructor");
    }
   public void printInfo(){
        System.out.println(stdID);
        super.display();
    }
}
