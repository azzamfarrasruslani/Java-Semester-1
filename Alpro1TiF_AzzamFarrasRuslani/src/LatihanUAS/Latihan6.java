
package LatihanUAS;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
         int i, j, tinggi, bil;
        Scanner obj = new Scanner(System.in);
        System.out.println("input tinggi segitiga :");
        tinggi = obj.nextInt();
        for (i = 1; i <= tinggi; i++) {
            bil = i;  
            for (j = 1; j <= i; j++) {
                System.out.print(String.format("%3d", bil));
                bil = bil + tinggi - j;
            }
            System.out.println();
        }
    }
}
