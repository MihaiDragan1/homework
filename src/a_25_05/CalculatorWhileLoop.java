package a_25_05;

import java.util.Scanner;

public class CalculatorWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int n2 = scanner.nextInt();
        System.out.println("Introduceti operatia dorita: ");


        char sign;
        sign = scanner.next().charAt(0);

        //n-o sa mearga asa cum te astepti, in momentul asta merge exact ca atunci cand foloseai switch
        while (sign == '+') {

            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            break;
        }
        while (sign == '-') {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            break;
        }
        while (sign == '*') {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            break;
        }

        while (sign == '/') {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            break;
        }

    }
}

