package LatihanUAS;

import javax.swing.JOptionPane;

public class Latihan8 {
public static void main(String[] args) {
        String[][] dataMobil = {
            {"B1A", "Bentley", "8.5"},
            {"B2B", "Ferrari", "12.5"},
            {"B3C", "Mercedes E Class", "1.3"},
            {"B4D", "McLaren", "7.0"}
        };
        int jmlMob = 0;
        double totPeng = 0.0;
        String jawaban;

        for (int i = 0; i < dataMobil.length; i++) {
            totPeng += Double.parseDouble(dataMobil[i][2]);
            jmlMob++;
        }

        System.out.println("Nama Pemilik : Mr.Tony\nJumlah Mobil : " + jmlMob + "\nTotal Pengeluaran : " + totPeng);

        boolean cari = false;
        do {
            try {
                String cariMob = JOptionPane.showInputDialog("Masukkan No Plat Mobil Yang ingin di cari");
                for (int i = 0; i < dataMobil.length; i++) {
                    if (cariMob.equalsIgnoreCase(dataMobil[i][0])) {
                        System.out.println("Nama Mobil : " + dataMobil[i][1] + "\nHarga Mobil : " + dataMobil[i][2]);
                        cari = true;
                    }
                }
                if (!cari) {
                      JOptionPane.showMessageDialog(null, "Data Plat Tidak Tersedia");
                }
            } catch (Exception e) {
                System.out.println("Terjadi Kesalahan. Coba Lagi.");
              
            }

            jawaban = JOptionPane.showInputDialog("Apakah Anda Ingin Mencari data Mobil lagi ? ");
        } while (jawaban.equalsIgnoreCase("ya"));
    }
}
