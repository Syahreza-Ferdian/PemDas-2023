package LiveCoding4;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(reverse(345));
        int input = sc.nextInt();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Bilangan tersebut merupakan bilangan palindrome");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan palindrome");
        }

        sc.close();
    }

    // public static int reverse(int number) {
    //     String numberConv = String.valueOf(number);
    //     String reversal = "";

    //     for (int i = numberConv.length() - 1; i >= 0; i--) {
    //         reversal += numberConv.charAt(i);
    //     }

    //     return Integer.parseInt(reversal);
    // }

    public static int reverse(int number) {
        int digit = 0;
        int reversal = 0;

        do {
            digit = number % 10;
            reversal = (reversal * 10) + digit;
            number /= 10;
        } while (number > 0);

        return reversal;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
