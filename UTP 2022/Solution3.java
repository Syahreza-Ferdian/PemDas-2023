import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String perintah = sc.nextLine();
        double angka1 = sc.nextDouble();
        double angka2 = sc.nextDouble();
        
        switch (perintah) {
            case "add" :
                System.out.println(angka1 + angka2);
                break;
            case "multiply" :
                System.out.println(angka1 * angka2);
                break;
            case "division" :
                System.out.println(angka1 / angka2);
                break;
            case "subtract" :
                System.out.println(angka1 - angka2);
                break;
        }
        LinkedList<Integer> ll = new LinkedList<>();
    
        sc.close();
    }
}