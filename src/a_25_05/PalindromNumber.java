package a_25_05;

public class PalindromNumber {
    public static void main(String[] args) {

// Check if a number is palindrom

        int num = 1231, reversedInteger = 0, digit, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            digit = num % 10;
            reversedInteger = reversedInteger * 10 + digit;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}

