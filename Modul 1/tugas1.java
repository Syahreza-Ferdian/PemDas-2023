import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bilangan1, bilangan2;
        System.out.print("Masukkan bilangan pertama\t: ");
        bilangan1 = masukan.nextInt();
        System.out.print("Masukkan bilangan kedua\t\t: ");
        bilangan2 = masukan.nextInt();
        System.out.println("Hasil penjumlahan\t\t: " + (bilangan1 + bilangan2));
        System.out.println("Hasil pengurangan\t\t: " + (bilangan1 - bilangan2));
        System.out.println("Hasil perkalian\t\t\t: " + (bilangan1 * bilangan2));
        System.out.println("Hasil pembagian\t\t\t: " + ((double)bilangan1 / bilangan2));
        masukan.close();
    }
}
