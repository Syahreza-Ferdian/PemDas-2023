import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        // String a = input.nextLine();
        input.close(); 

        // SWITCH CASE UNTUK STRING BISA LANGSUNG. SETIAP CASE DI DALAM SWITCH NYA ADALAH 'CASE-SENSITIVE' TERHADAP STRING TERSEBUT
        // switch (a) {
        //     case "Hello":
        //         System.out.println("Anda memasukkan " + a);
        //         break;
        //     case "hello" :
        //         System.out.println("Anda memasukkan " + a + " lowercase");
        //         break;
        //     default:
        //         System.out.println("Anda memasukkan string lain");
        //         break;  
        // }
        

        // SWITCH CASE UNTUK TIPE DATA BILANGAN (INTEGER, DOUBLE, LONG, DSB)
        // JUMLAH CASE NYA MENYESUAIKAN
        switch (bilangan) {
            case 1 : {
                System.out.println("Small Size");
                break; //PENTING DIKASIH 'BREAK' UNTUK SETIAP CASE NYA SUPAYA SETELAH MENGEKSEKUSI CASE TERTENTU, TIDAK LANJUT MENGEKSEKUSI CASE BERIKUTNYA
            }
            case 2 : {
                System.out.println("Medium Size");
                break;
            }
            case 3 : {
                System.out.println("Large Size");
                break;
            }
            default : {
                System.out.println("Unknown size"); //LINE INI AKAN DI-EKSEKUSI APABILA NILAI DARI VARIABEL 'BILANGAN' TIDAK MEMENUHI SEMUA CASE 1 SAMPAI CASE 3
            }
        }
    }
}
