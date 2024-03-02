package LatihanPesiapan;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Karyawan : ");
        int jmlKry = input.nextInt();

        String[] nama = new String[jmlKry];
        int[] gaji = new int[jmlKry];
        
        
        int tmpKorupsi = gaji[0];
        String tampNama = "";
        for (int i = 0; i < jmlKry; i++) {
            System.out.print("Masukan Nama Karyawan ke- " + (i + 1) + " : ");
            nama[i] = input.next();

            System.out.print("Masukan Jumlah Korupsi " + nama[i] + " : ");
            gaji[i] = input.nextInt();

            System.out.println();

        }
        
        
        for (int i = 0; i < gaji.length; i++) {
            if (gaji[i] > tmpKorupsi) {
                tmpKorupsi = gaji[i];
                tampNama = nama[i];
            }
        }
        
        System.out.println("Orang dengan korupsi terbanyak \nNama : " + tampNama + "\nJumlah Korupsi : Rp. " + tmpKorupsi);

    }
}
