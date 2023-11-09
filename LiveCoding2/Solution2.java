package LiveCoding2;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int bilangan = sc.nextInt();
        int jumlah = 0;

        for (int i = 1; i <= bilangan; i++) {
            jumlah += i;
        }
        System.out.println(jumlah);

        sc.close();
    }
}

// 1 + 2 + 3 + 4 + 5 = 15
