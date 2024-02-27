package CA214.ConstructorChaining;

import CA214.Polymorphsm.Test;

public class C2 extends Test {
    C2(){
        super();
        System.out.println("c2");
    }
    C2(String info){
        System.out.println("c2");
    }

    public static void main(String[] args) {
        C2 ob = new C2();
        ob.age = 45;
    }
}
