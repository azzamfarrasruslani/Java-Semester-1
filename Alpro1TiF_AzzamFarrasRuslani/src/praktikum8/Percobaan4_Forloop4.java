package praktikum8;
import java.util.Scanner;
/**
 *
 * @author 225 - PC 04
 */
public class Percobaan4_Forloop4 {
    public static void main(String[] args) {
        int i, batas, angka;
        int jumlah = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukan angka batas perulangan: ");
        batas = input.nextInt();
        
        for (i = 1; i <= batas; i++) {
            System.out.println("Masukan sebuah bilangan bulat: ");
            angka = input.nextInt();
            
            if (angka %2 == 0) {
                 jumlah+=angka;
            }
        }
        System.out.println("Jumlah total bilangan genap yang anda masukan adalah : " + jumlah);
    }
}
