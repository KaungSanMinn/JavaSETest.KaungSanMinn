package withi_ide;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1 :
                String show1 = "First";
                System.out.println(show1);
                break;
            case 2 :
                String show2 = "Second";
                System.out.println(show2);
                break;
            case 3:
                String show3 = "Third";
                System.out.println(show3);
                break;
        }
    }
}
