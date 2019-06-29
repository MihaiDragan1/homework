package b_22_06.RefactorFilesHomework1;

public class RefactorSumOfFirst100Numbers {

    public static void main(String[] args) {

        int n = 100;

        System.out.println(sum(n));
    }

     public static int sum(int n){
    int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
return sum;
        }
    }
