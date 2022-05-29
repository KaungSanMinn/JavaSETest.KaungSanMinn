package withi_ide;

public class Q10 {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 8, 6, 9};
        int value = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    value = a[i];
                    a[i] = a[j];
                    a[j] = value;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

}
