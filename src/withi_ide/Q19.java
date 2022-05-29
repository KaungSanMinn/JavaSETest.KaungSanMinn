package withi_ide;

interface Callable {
    default void sum() {
        System.out.println("Parent Class");
    }
}

public class Q19 implements Callable {

    public void sum() {
        System.out.println("Child Class");
    }

    public static void main(String[] args) {

    }
}
