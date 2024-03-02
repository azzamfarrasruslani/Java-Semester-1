package Pertemuan13;

import java.util.Scanner;
// @author Azzam Farras Ruslani

public class Test1Percobaan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data[][] = new String[2][3];

        for (int i = 0; i < 2; i++) {
            System.out.println("Inputkan data ke-" + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Masukan merek laptop");
                        data[i][j] = input.nextLine();
                        break;
                    case 1:
                        System.out.println("Masuakan Processor laptop");
                        data[i][j] = input.nextLine();
                        break;
                    case 2:
                        System.out.println("Masuakan Harga laptop");
                        data[i][j] =input.nextLine();
                        break;
                    default:
                        break;
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
                for (int j = 0; j < 3; j++) {
                    System.out.println(data[i][j] + "\t");
                }
                System.out.println();
                numb++;
                int harga = Integer.parseInt(data[i][2]);
                if (harga <= 10_000_000) {
                    System.out.println("Data harga laptop dibawah 10juta");
                    System.out.println(data[i][2]);
                }
            }
        }
    }
}
