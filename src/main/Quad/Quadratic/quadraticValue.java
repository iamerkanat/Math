package Quadratic;
import java.util.Scanner;

import static java.lang.Math.sqrt;


public class quadraticValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ax^2 + bx + c = 0;
        System.out.println("Enter your variable: "); //
        String x = scanner.next();

        System.out.println("Enter your a: ");
        int a = scanner.nextInt();
        System.out.println("Enter your b: ");
        int b = scanner.nextInt();
        System.out.println("Enter your c:");
        int c = scanner.nextInt();

        double x1 = (b + sqrt((b * b) - 4 * a * c)) / 2*a;
        double x2 = (b - sqrt((b * b) - 4 * a * c)) / 2*a;

        System.out.println(x1);
        System.out.println(x2);

    }
}