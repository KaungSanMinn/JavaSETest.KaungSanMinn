package withi_ide;

abstract class Parent {
    void sum (){
        System.out.println("Parent Class");
    }
}

public class Q28 extends  Praents{
    @Override
    void sum() {
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        Q28 obj = new Q28();
        obj.sum();
    }
}
