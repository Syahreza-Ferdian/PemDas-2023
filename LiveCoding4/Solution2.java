package LiveCoding4;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();

        displaySortedNumber(angka1, angka2, angka3);

        sc.close();
    }

    public static void displaySortedNumber(int angka1, int angka2, int angka3) {
        int terbesar, tengah, terkecil;
        
        if(angka1 >= angka2){
            tengah = angka1;
            terkecil = angka2;
        } else {
            tengah = angka2;
            terkecil = angka1;
        }

        if(tengah >= angka3) {
            terbesar = tengah;

            if(terkecil >= angka3){
                tengah = terkecil;
                terkecil = angka3;
            } else {
                tengah = angka3;
            }
        } else {
            terbesar = angka3;
        }

        System.out.printf("%d %d %d", terkecil, tengah, terbesar);
    }
}
