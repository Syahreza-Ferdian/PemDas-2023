package LiveCoding2;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nilai = scan.nextInt();
        String konvert = "";

        if (nilai <= 100 && nilai > 80) {
            konvert = "A";
        }
        else if (nilai > 75) {
            konvert = "B+";
        }
        else if (nilai > 69) {
            konvert = "B";
        }
        else if (nilai > 60) {
            konvert = "C+";
        }
        else if (nilai > 55) {
            konvert = "C";
        }
        else if (nilai > 50) {
            konvert = "D+";
        }
        else if (nilai > 44) {
            konvert = "D";
        }
        else if (nilai >= 0) {
            konvert = "E";
        }

        System.out.printf("Hasil konversi nilai: %s\n", konvert);

        scan.close();
    }
}
