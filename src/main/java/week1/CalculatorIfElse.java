package week1;

import java.util.Scanner;

public class CalculatorIfElse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            int n1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int n2 = scanner.nextInt();
            System.out.println("Introduceti operatia dorita: ");


            char sign; //This assigns the character variable + - * //


            sign=scanner.next().charAt(0);
            if (sign == '+') {
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            }
                else if(sign == '-') {
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            }

            else if(sign == '*') {
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            }

            else if(sign == '/') {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            }

                else
                    System.out.println("Bad operation!");
            }


        }