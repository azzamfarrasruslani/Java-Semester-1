package praktikum8;

import java.util.Scanner;

/**
 *
 * @author 225 - PC 04
 */
public class Percobaan10_Dowhile {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        Scanner input = new Scanner(System.in);

        do {
            sum += number;
            System.out.println("Masukan sebuah bilangan bulat: ");
            number = input.nextInt();
        } while (number >= 0);
        
        System.out.println("Jumlah = " + sum);
    }
}
