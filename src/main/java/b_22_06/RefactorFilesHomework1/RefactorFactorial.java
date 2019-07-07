package b_22_06.RefactorFilesHomework1;

import java.util.Scanner;

public class RefactorFactorial {

    public static int daFactorialul(int n) {
        int c, fact = 1;


        if (n < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (c = 1; c <= n; c++)
                fact = fact * c;

            System.out.println("Factorial of " + n + " is = " + fact);
        }
        return fact;
        }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to calculate it's factorial");
        int d = input.nextInt();
        System.out.println(daFactorialul(d));
    }
}


