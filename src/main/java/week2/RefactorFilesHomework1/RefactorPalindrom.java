package week2.RefactorFilesHomework1;

import java.util.Scanner;

public class RefactorPalindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un numar intre 10 si 1000: ");
        int numar = input.nextInt();
        System.out.print("Este numarul palindrom? ");
        System.out.println(palindromSauNu(numar));
    }

    public static boolean palindromSauNu(int a) {

        int b = a;
        int invers = 0;
        while (a != 0) {
            int c = a % 10;
            invers = invers^10 + c;
            a = a / 10;
        }
    if (b==invers)
        return true;
    else
        return false;
    }

}

