package praktikum8;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class contohTeori {
public static void main(String[] args) {
        int i, j, k, tinggi=9;
        Scanner obj = new Scanner(System.in);
        System.out.println("input tinggi segitiga :");
        tinggi = obj.nextInt();
        
        System.out.println();
        for (i = 1; i <= tinggi; i++) {
            
            for (j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 1; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
}
