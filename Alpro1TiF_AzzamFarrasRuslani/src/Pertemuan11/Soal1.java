package Pertemuan11;

import javax.swing.JOptionPane;

//@author Azzam Farras Ruslani
public class Soal1 {

    public static void main(String[] args) {
        int jumlahTamu;
        String ulang, cariNama;
        jumlahTamu = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Tamu"));
        String[] nama = new String[jumlahTamu];
        String[] noKamar = new String[jumlahTamu];

        for (int i = 0; i < jumlahTamu; i++) {
            nama[i] = JOptionPane.showInputDialog("Masukan nama tamu ke - " 
                    + (i + 1) + " yang telah check-in");
            noKamar[i] = JOptionPane.showInputDialog
        ("Masukan Nomor kamar tamu ke - " + (i + 1) + " yang telah check-in");
        }
        System.out.println("Data Tamu Yang Telah Check-in");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s %-15s  %-15s \n", "NO", "Nama", "Nomor Kamar");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.printf("%-15s %-15s  %-15s \n", (i + 1), nama[i], noKamar[i]);
        }
        do {
            cariNama = JOptionPane.showInputDialog("Nama Orang Yang Akan Dicari ");
            boolean ada = false;
            for (int i = 0; i < jumlahTamu; i++) {
                if (nama[i].equalsIgnoreCase(cariNama)) {
                    System.out.println(nama[i]
                            + " Telah Check-in pada Nomor Kamar " + noKamar[i]);
                    ada = true;
                    break;
                }
            }
            if (!ada) {
                System.out.println("Nama Tidak Ditemukan dalam Data Check-in");
            }
            ulang = JOptionPane.showInputDialog("Apakah anda ingin mencari "
                    + "lagi tamu yang telah check-in [ya/tidak]");
        } while (ulang.equalsIgnoreCase("ya"));
    }
}
