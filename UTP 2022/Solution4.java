import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution4 {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Hitung Deskriminan
        double deskriminan = Math.pow(b, 2) - (4 * a * c);
        double akar1 = (-b + Math.sqrt(deskriminan)) / (2 * a);
        double akar2 = (-b - Math.sqrt(deskriminan)) / (2 * a);

        
        // Cek Apabila Deksriminan > 0, atau = 0, atau bilangan negatif
        if (deskriminan > 0) {
            System.out.println("R1: " + akar1);
            System.out.println("R2: " + akar2);
        }
        else if (deskriminan == 0) {
            System.out.println("Akar: " +akar1);
        }
        else {
            System.out.println("Tidak ada akar");
        }

        // Kemudian hitung berdasarkan rumus yang diberikan

    }
}
