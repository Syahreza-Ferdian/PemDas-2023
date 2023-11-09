package LiveCoding2;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bilangan = sc.nextInt();

        for (int i = 1; i <= bilangan; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d genap\n", i);
            }
            else System.out.printf("%d ganjil\n", i);
        }
        
        sc.close();
    }
}
