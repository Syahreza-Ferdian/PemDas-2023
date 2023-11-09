package LiveCoding3;
// import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int jumlahRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                jumlahRow += arr[i][j];
            }
            System.out.printf("Jumlah row-%d: %d\n", i+1, jumlahRow);
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.printf("Angka Terbesar row-%d: %d\n", i+1, max);
        }
        sc.close();
    }
}
