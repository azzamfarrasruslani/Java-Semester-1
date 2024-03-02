package RevisiLaporan;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Pertemuan4Lat2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pemesanan: ");
        int jumlahPemesanan = input.nextInt();

        double diskon ;
        int harga;
        String anak;
        int totalHarga = 0;
        double hargaFix;
        double hargaPajak ;

        for (int i = 1; i <= jumlahPemesanan; i++) {
            System.out.println("\nData Pemesanan ke-" + i);
            System.out.print("Nama Penumpang: ");
            String namaPenumpang = input.next();
            System.out.print("Rute Penerbangan (PKU-CGK, PKU-BDO, PKU-DPS, PKU-SUB, PKU-YKIA, PKU-KLIA): ");
            String rute = input.next();
            System.out.println(namaPenumpang);
            if (rute.equalsIgnoreCase("PKU-CGK")) {
                harga = 876_000;
                totalHarga += harga;
            } else if (rute.equalsIgnoreCase("PKU-BDO")) {
                harga = 1_354_000;
                totalHarga += harga;
            } else if (rute.equalsIgnoreCase("PKU-DPS")) {
                harga = 1_620_000;
                totalHarga += harga;
            } else if (rute.equalsIgnoreCase("PKU-SUB")) {
                harga = 1_554_000;
                totalHarga += harga;
            } else if (rute.equalsIgnoreCase("PKU-YKIA")) {
                harga = 1_635_000;
                totalHarga += harga;
            } else if (rute.equalsIgnoreCase("PKU-KLIA")) {
                harga = 335_000;
                totalHarga += harga;
            }
        }
        System.out.print("Apakah Anda Membawa Anak ? : ");
        anak = input.next();

        if (anak.equalsIgnoreCase("Ya")) {
            diskon = totalHarga - (totalHarga * 0.3);
            hargaFix = diskon;
        } else {
            hargaFix = totalHarga;
        }
        
        hargaPajak = hargaFix + (hargaFix * 0.05);
        System.out.println("Harga Akhir " + hargaPajak);
        System.out.println("total Harga " + totalHarga);
        System.out.println("Harga FIx" + hargaFix);
    }
}
