package withi_ide;
interface Variable {
    default void sum(){
        System.out.println();
    }
}
interface Receivable extends Variable {

    default void sum() {
        System.out.println();
    }

    public static void main(String[] args) {
        Receivable receivable = new Receivable() {
            @Override
            public void sum() {
                System.out.println("Override");
            }
        };
    }
}
