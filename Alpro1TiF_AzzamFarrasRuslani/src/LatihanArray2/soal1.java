package LatihanArray2;

import java.util.Scanner;

/**
 *
 * @author Kelompok 6
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int inputAngka, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyak Data : ");
        inputAngka = input.nextInt();
        int hasil = 1;
        for (i = inputAngka; i >= 2; i--) {

            System.out.print(i + " * ");
            hasil = hasil * i;

        }
        System.out.print(1 + " = " + hasil);
    }
}
