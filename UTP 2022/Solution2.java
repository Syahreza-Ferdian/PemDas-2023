import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        double pBalok1, lBalok1, tBalok1, pBalok2, lBalok2, tBalok2;

        pBalok1 = sc.nextDouble();
        lBalok1 = sc.nextDouble();
        tBalok1 = sc.nextDouble();
        pBalok2 = sc.nextDouble();
        lBalok2 = sc.nextDouble();
        tBalok2 = sc.nextDouble();

        double vBalok1 = pBalok1 * lBalok1 * tBalok1;
        double vBalok2 = pBalok2 * lBalok2 * tBalok2;

        if (vBalok1 > vBalok2) {
            System.out.println("Balok pertama lebih besar");
        }
        else if (vBalok2 > vBalok1) {
            System.out.println("Balok kedua lebih besar");
        }
        else if (vBalok1 == 0 && vBalok2 == 0) {
            System.out.println("Tidak Ada Balok");
        }
        else if (vBalok1 == vBalok2) {
            System.out.println("Kedua Balok sama Besar");
        }

        sc.close();
    }
}