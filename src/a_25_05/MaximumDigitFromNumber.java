package a_25_05;

public class MaximumDigitFromNumber {
    public static void main(String[] args) {

        //Display the max digit from a number

        int n = 50968;
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

            result = min + max;
        }

        System.out.println(result);
    }
}
