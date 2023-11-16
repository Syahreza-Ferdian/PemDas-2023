package LiveCoding4;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil = sc.nextInt();
        int jumlah = 0;

        while (true) {
            jumlah = sumDigits(bil);

            if (jumlah / 10 == 0) {
                break;
            } 

            bil = jumlah;
        }
        
        System.out.println(jumlah);

        sc.close();
    }

    public static int sumDigits(int angka) {
        int jumlah = 0, digit;

        do {
            digit = angka % 10;
            jumlah += digit;
            angka /= 10;
        } while (angka > 0);

        return jumlah;
    }
}
