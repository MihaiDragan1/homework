package week2.RefactorFilesHomework1;


import java.util.Scanner;

public class RefactorMaximumDigitFromNumber {


    public static int MaximumDigitFromNumber() {

        //Display the max digit from a number

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int result = 0;

        if (n > 0) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            while (n > 0) {
                int digit = n % 10;

                max = Math.max(max, digit);
                min = Math.min(min, digit);

                n /= 10;
            }

            result = max;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MaximumDigitFromNumber());

    }
}
