import java.util.*;

public class basic_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = 100;
        char char1 = 'A';
        char char2 = 'B';

        // CONTOH COMPARISON OPERATOR '=='
        // boolean compare = char1 == char2;
        // System.out.println(compare);



        if (nilai >= 85) {
            System.out.println("Nilai anda A");
        }
        else if(nilai > 70) {  // NILAI KURANG DARI 85, TAPI LEBIH DARI 70
            System.out.println("Nilai anda B");
        }
        else if(nilai > 50) { // NILAI KURANG DARI 70, TAPI LEBIH DARI 50
            System.out.println("Nilai anda C");
        }
        else { // APABILA TIDAK ADA YG MEMENUHI SEMUA KONDISI DI ATAS, BLOK ELSE INI AKAN DI-EKSEKUSI. (DALAM HAL INI NILAINYA KURANG DARI 50)
            System.out.println("Nilai anda D");
        }



        // CONDITIONAL ASSIGNMENT (TERNARY OPERATOR)
        // APABILA KONDISI BERNILAI TRUE, MAKA YANG DI-EKSEKUSI ADALAH SESUDAH TANDA TANYA (?), APABILA FALSE YANG DI EKSEKUSI ADALAH STATEMENT SETELAH TANDA TITIK DUA (:)

        // int nilai = input.nextInt();
        // String s = nilai > 2 ? "Berhasil" : "Gagal";
        // NILAI JIKA -->           BENAR       SALAH      



        // String s = nilai > 2 ? nilai == 6 ? "Sama dengan 6" : "Berhasil" : "Gagal";
        // System.out.println(s);
    }
}
