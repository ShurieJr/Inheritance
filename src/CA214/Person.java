package CA214;

public class Person {  //parent class
    //variables
    String name , address;
    int age;
    //constructors
    Person(){
        age = 34;
        name = "Ali";
        address = "Waaberi";
    }
     Person(String name , int age , String address){
        this.name = name ;
        this.age = age ;
        this.address =  address ;
    }

    //methods
    public void display(){
        System.out.println(name);
        System.out.println(age  );
        System.out.println(address  );
    }
}
