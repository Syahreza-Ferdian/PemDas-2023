import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //instansiasi object scanner
        int bilangan = in.nextInt(); //menyimpan nilai inputan ke variable 'bilangan'
        double bilangan2 = in.nextDouble();
        in.nextLine();
        String string1 = in.nextLine();
        System.out.println("Angka yang diinputkan adalah : " + bilangan);
        System.out.println("Angka yang diinputkan adalah : " + bilangan2);
        System.out.println("String yang diinputkan adalah : " + string1);

        in.close();
    }
}
