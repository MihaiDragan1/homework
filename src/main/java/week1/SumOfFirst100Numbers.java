package week1;

public class SumOfFirst100Numbers {

    public static void main(String[] args) {
        // Calculate the sum of the first 100 numbers higher than 0

        int n = 100;
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;

            System.out.println(sum);
        }
    }
}