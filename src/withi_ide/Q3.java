package withi_ide;

public class Q3 {
    public static void main(String[] args) {
        int a [] = {23,24,12,78,62};
        int largestnumber  = a[0];

        for (int i = 0; i < a.length; i++) {
            if (largestnumber < a[i]) {
                largestnumber=a[i];
            }
        }
        System.out.println(largestnumber);
    }
}
