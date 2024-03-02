package praktikum8;
import java.util.Scanner;
/**
 *
 * @author 225 - PC 04
 */
public class Percobaan16_NestedloopWhile2 {
    public static void main(String[] args) {
        int i, j, batas_i, batas_j;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Berapa jumlah baris bintang yang ingin di tampilkan? ");
        batas_i = input.nextInt();
        System.out.println("Berapa jumlah kolom bintang yang ingin di tampilkan? ");
        batas_j = input.nextInt();
        
        i=1;
        
        while (i <= batas_i) {
            j =1;
            while (j <= batas_j) {
                System.out.println("*");
                j+=1;
            }
            System.out.println("");
            i++;
        }
    }
}
