package CA218.constructorChaining;

public class Faculty extends Employee{

    Faculty(){
        System.out.println("Faculty constructor!");
    }


    //main method
    public static void main(String[] args) {
        new Faculty();
    }
}
