package withi_ide;
class Praents {
    void sum(){
        System.out.println("Parent Class");
    }
}
class Child extends Praents {
    void sum(){
        System.out.println("Child Class");
    }
}
public class Q17 {
    public static void main(String[] args) {
        Child child = new Child();
        child.sum();
    }
}
