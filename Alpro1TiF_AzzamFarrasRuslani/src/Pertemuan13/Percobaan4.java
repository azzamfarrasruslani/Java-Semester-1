package Pertemuan13;

import java.util.Scanner;

// @author Azzam Farras Ruslani
public class Percobaan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data[][] = new String[2][2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Inputkan data ke-" + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Masukan merek laptop");
                    data[i][j] = input.nextLine();
                } else if (j == 1) {
                    System.out.println("Masuakan Processor laptop");
                    data[i][j] = input.nextLine();
                }
            }
        }

        System.out.println("Nomor\t");
        System.out.println("Merek\t");
        System.out.println("Processor\t");
        System.out.println();
        int numb = 1;
        for (int i = 0; i < 2; i++) {
            {
                System.out.println(numb + "\t");
                for (int j = 0; j < 2; j++) {
                    System.out.println(data[i][j] + "\t");
                }
                System.out.println();
                numb++;
            }
        }
    }
}
