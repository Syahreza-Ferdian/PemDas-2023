package UAP_2022;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution2 {

  	public static String reverse(String angka) {
    	/* Silahkan Buat Method Untuk Membalikan angka */
        String output = "";
        for(int i = angka.length() - 1; i >= 0; i--) {
            output += angka.charAt(i);
        }
        return output;
    }
  
    public static void main(String[] args) {
        /* Happy Coding! */
        Scanner sc = new Scanner(System.in);
        String angka = sc.nextLine();

        if(angka.equals("196")) {
            System.out.printf("Bilangan dilarang!\n");
            System.exit(0);
        }

        String reversed = reverse(angka);
        int konvertAngka, konvertAngkaReversed, hasil = 0;
        while (!cekPalindrome(angka, reversed)) {
            konvertAngka = Integer.parseInt(angka);
            konvertAngkaReversed = Integer.parseInt(reversed);
            hasil = konvertAngka + konvertAngkaReversed;
            System.out.printf("%d + %d = %d\n", konvertAngka, konvertAngkaReversed, hasil);
            angka = String.valueOf(hasil);
            reversed = reverse(angka);
        }
        System.out.printf("%d merupakan bilangan palindrome\n", hasil);

        sc.close();
    }

    public static boolean cekPalindrome(String angka1, String reversed) {
        return angka1.equals(reversed);
    }
}
