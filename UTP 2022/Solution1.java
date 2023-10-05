import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        if(input1.equalsIgnoreCase(input2)) {  // equalsIgnoreCase() membandingkan kedua string tanpa memperhatikan perbedaan huruf besar (uppercase) dan kecil (lowercase)
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }

        sc.close();
    }
}