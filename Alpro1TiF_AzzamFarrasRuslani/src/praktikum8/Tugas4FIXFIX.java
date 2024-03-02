package praktikum8;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas4FIXFIX {

    public static void main(String[] args) {
        String input, dapatDiskon = null;
        int jmlAnak, i, usia, jmlPesanan, jmlDewasa, hargaDewasa, hargaAnak = 0, totalHarga, hargaDiskon, hargaFinal;
        do {
            JOptionPane.showMessageDialog(null, "Selamat Datang Silahkan Memesan Tiket "
                    + "\nUsia 1-3 tahun harga tiket = Rp.100.000 \nUsia 4 - 8 tahun harga tiket = Rp.110.000 "
                    + "\nUsia 9 - 16 tahun harga tiket = Rp.150.000 \nUsia 17 tahun keatas harga tiket = Rp.250.000");
            jmlAnak = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Masukan Jumlah Anak"));

            for (i = 1; i <= jmlAnak; i++) {
                usia = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Masukan Usia Anak " + i));

                if (usia >= 1 && usia <= 3) {
                    hargaAnak += 100000;
                } else if (usia >= 4 && usia <= 8) {
                    hargaAnak += 110000;
                } else if (usia >= 9 && usia <= 16) {
                    hargaAnak += 150000;
                } else {
                    JOptionPane.showMessageDialog(null, "Usia anak salah, Coba lagi ");
                    System.exit(0);
                }
            }
            jmlDewasa = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Masukan Jumlah dewasa"));
            hargaDewasa = jmlDewasa * 250000;
            totalHarga = hargaAnak + hargaDewasa;
            // Diskon 12.12
            jmlPesanan = jmlAnak + jmlDewasa;
            if (jmlPesanan >= 5) {
                hargaDiskon = (int) (totalHarga - (totalHarga * 0.25));
                dapatDiskon = "25%";
                hargaFinal = hargaDiskon;
            } else {
                hargaFinal = totalHarga;
            }

            JOptionPane.showMessageDialog(null, "Jumlah Anak : " + jmlAnak + "\nJumlah Dewasa : "
                    + jmlDewasa + "\nTotal Harga Anak : Rp. "
                    + hargaAnak + "\nTotal Harga Dewasa : Rp. " + hargaDewasa + "\nJumlah Pesanan : "
                    + jmlPesanan + "\nDiskon : " + dapatDiskon + "\nHarga Sebelum Diskon : Rp. " + totalHarga
                    + "\nTotal Harga : Rp. " + hargaFinal);

            input = JOptionPane.showInputDialog("Apakah Ingin Memesan Lagi \n[ya/tidak]");
        } while (input.equalsIgnoreCase("ya"));
    }
}
