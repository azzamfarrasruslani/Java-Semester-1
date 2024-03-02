package Pertemuan13;

import java.util.Scanner;

// @author Azzam Farras Ruslani
public class Test2Percobaan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data[][] = new String[2][3];

        for (int i = 0; i < 2; i++) {
            System.out.println("Inputkan data ke-" + (i + 1) + ":");
            System.out.println("Masukan merek laptop");
            data[i][0] = input.next();
            System.out.println("Masukan Processor laptop");
            data[i][1] = input.next();
            System.out.println("Masukan Harga laptop");
            data[i][2] = input.next();
        }
        System.out.println("======================================"
                + "===================");
        System.out.printf("%-15s %-15s %-15s %-15s \n", 
                "Nomor", "Merek", "Processor", "Harga");
        System.out.println("===================================="
                + "=====================");
        for (int i = 0; i < 2; i++) {
            System.out.printf("%-15s %-15s %-15s %-15s \n", 
                    (i + 1), data[i][0], data[i][1], data[i][2]);
        }
        System.out.println("\n\n\n");
        System.out.println("Data Harga Laptop Dibawah 10juta");
        System.out.println("==================================="
                + "======================");
        System.out.printf("%-15s %-15s %-15s %-15s \n",
                "Nomor", "Merek", "Processor", "Harga");
        System.out.println("================================="
                + "========================");
        for (int i = 0; i < 2; i++) {
            int harga = Integer.parseInt(data[i][2]);
            if (harga < 10_000_000) {
                System.out.printf("%-15s %-15s %-15s %-15s \n", 
                        (i + 1), data[i][0], data[i][1], data[i][2]);
            }
        }
    }
}
