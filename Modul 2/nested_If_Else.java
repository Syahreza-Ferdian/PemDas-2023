import java.util.Scanner; 
public class nested_If_Else{
    public static void main(String[] args){ 
        Scanner in = new Scanner(System.in); 
        System.out.print("masukkan nilai : "); 
        int value = in.nextInt();
        in.close();

        if(value * 2 < 50){
            value += 10;
        }

        if(value<=20){
            System.out.println("Filkom"); 
            if(value % 2 == 1){
                System.out.println("UB");
            }
            else{
                System.out.println("Brawijaya");
            }
        }
        else{
            System.out.println("PTIIK"); 
            if(value % 2 == 1){
                System.out.println("UB");
            }
            else{
                System.out.println("Brawijaya");
            }
        }
    }
}