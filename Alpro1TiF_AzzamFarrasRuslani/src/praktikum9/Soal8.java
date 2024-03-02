package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelommpok 6
 */
public class Soal8 {

    public static void main(String[] args) {
        int pot = 7000, total = 0, harga = 0, i, jml;
        String tampungan = "", member, nambah, beli, pengarang = null, judul = null, kode;
        jml = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa jumlah buku yang anda cari infonya?"));

        i = 1;
        do {
            kode = (JOptionPane.showInputDialog(null, "Masukan kode buku ke- " + i));
            if (kode.equalsIgnoreCase("181818A")) {
                kode = ("181818A");
                judul = ("dhirga");
                pengarang = ("natalia tan");
                harga = 68000;
            } else if (kode.equalsIgnoreCase("191919B")) {
                kode = ("191919B");
                judul = ("Summer Sky");
                pengarang = ("Stephanie Zen");
                harga = 124000;
            } else if (kode.equalsIgnoreCase("202020C")) {
                kode = ("202020C");
                judul = ("Noversation");
                pengarang = ("Valerie Patkar");
                harga = 115000;
            } else if (kode.equalsIgnoreCase("171717D")) {
                kode = ("171717D");
                judul = ("Si Anak Badai");
                pengarang = ("Tere Liye");
                harga = 75000;
            } else if (kode.equalsIgnoreCase("161616E")) {
                kode = ("161616E");
                judul = ("Komet Minor");
                pengarang = ("Tere Liye");
                harga = 71500;
            } else if (kode.equalsIgnoreCase("101010F")) {
                kode = ("101010F");
                judul = ("me and my broken heart");
                pengarang = ("Wulanfadi ");
                harga = 69000;
            } else if (kode.equalsIgnoreCase("090909G")) {
                kode = ("090909G");
                judul = ("Dilan");
                pengarang = ("Pidi Baiq ");
                harga = 59000;
            } else {
                JOptionPane.showMessageDialog(null, "maaf pilihan tdk ada");
            }

            nambah = JOptionPane.showInputDialog("Informasi buku \nKode buku :" + kode + "\nJudul buku :" + judul
                    + "\nNama pengarang :" + pengarang + "\nHarga :" + harga
                    + "\nApakah ingin menambah buku ke keranjang ? (Ya/Tidak)");
            if (nambah.equalsIgnoreCase("ya")) {

            } else {
                JOptionPane.showMessageDialog(null, "terimakasih sudah mengunjungi toko kami");
            }

            i++;
            total += harga + 0;
            tampungan += " " + judul + " pengarang " + pengarang + "\n";

        } while (i <= jml);

        beli = JOptionPane.showInputDialog(null, " informasi keranjang\n " + tampungan + "\ntotal dalam keranjang "
                + total + "\n apakah beli (ya tdk)");
        if (beli.equalsIgnoreCase("ya")) {
            member = JOptionPane.showInputDialog("Apakah punya member\n (punya/tidak)");
            if (member.equalsIgnoreCase("punya")) {
                if (jml >= 3) {
                    total = total - pot;
                    total = (int) (total - (total * 0.15));
                    JOptionPane.showMessageDialog(null, "Informasi pembelian." + "\n" + tampungan
                            + "\ndiskon member :15% \ndiskon toko : 7000" + "\ntotal dlm keranjang :" + total);
                    JOptionPane.showMessageDialog(null, "terimakasih sudah mengunjungi toko kami");
                } else {
                    total = total - pot;
                    JOptionPane.showMessageDialog(null, "informasi pembelian" + "\n"
                            + tampungan + "\ndiskon toko : 7000" + "\ntotal dlm keranjang :" + total);
                    JOptionPane.showMessageDialog(null, "terimakasih sudah mengunjungi toko kami");
                }

            } else {
                total = total - pot;
                JOptionPane.showMessageDialog(null, "informasi pembelian\n  "
                        + tampungan + " \ndiskon toko : 7000" + total);
                JOptionPane.showMessageDialog(null, "terimakasih sudah mengunjungi toko kami");
            }
        } else {
            JOptionPane.showMessageDialog(null, "terimakasih sudah mengunjungi toko kami");
        }
    }
}
