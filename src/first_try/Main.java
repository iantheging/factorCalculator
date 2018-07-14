package first_try;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Form of equation is ax^2 + bx + c");
        System.out.println("Enter value for a: ");
        int a = s.nextInt();
        System.out.println("Enter value for b: ");
        int b = s.nextInt();
        System.out.println("Enter value for c: ");
        int c = s.nextInt();

        if ((Math.pow(b, 2) - 4 * a * c) >= 0) {
            double answer[] = Calculator.realRoots(a, b, c);
            System.out.println("" + answer[0] + ", " + answer[1]);
        } else {
            String ans[] = Calculator.imaginaryRoots(a, b, c);
            System.out.println("" + ans[0] + ", " + ans[1]);
        }
    }
}
