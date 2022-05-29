package withi_ide;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a){
            case 1 :
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
        }
    }
}
