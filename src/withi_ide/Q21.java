package withi_ide;
interface Runnable{
    default void sum (){
        System.out.println("Parent Class");
    }
}
class Q21 implements Receivable {
    @Override
    public void sum() {
        System.out.println("Child Class");
    }
class next implements Receivable {
    @Override
    public void sum() {
        System.out.println("Next Class");
    }
}
    public static void main(String[] args) {
        Q21 q21 = new Q21();
        q21.sum();
    }
}
