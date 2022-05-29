package withi_ide;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        System.out.println(" Enter 1 or 2 ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 1) {
            String show[] = {
                    "1.log in",
                    "2.log out",};

            Arrays.stream(show).forEach(System.out::println);

            Scanner scanner1 = new Scanner(System.in);
            int b = scanner1.nextInt();
            if (b == 1) {
                String show2[] = {
                        "Logging in"};
                Arrays.stream(show2).forEach(System.out::println);
            }else {
                System.out.println("Logging Out");
            }
        }
    }
}

