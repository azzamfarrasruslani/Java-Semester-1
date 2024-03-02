package Pertemuan11;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Soal4Test {

    public static void main(String[] args) {
        String[] hariArray = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu"};
        String nama, alamat, pengantar = null, tanya;
        int jmlTangki;
        double[] ukuranBak;
        double hargaFinal, totalHarga, biayaAntar = 0, diskon = 0.0, hargaDiskon, hargaFix;

        String hari = JOptionPane.showInputDialog("Selamat Datang di Toko Air Berkarya\nUntuk hari apa pesanannya?");
        nama = JOptionPane.showInputDialog("Masukan nama pemesan");
        alamat = JOptionPane.showInputDialog("Masukan alamat pesanan");
        jmlTangki = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah bak/tangki yang anda miliki?"));

        ukuranBak = new double[jmlTangki];

        for (int i = 0; i < jmlTangki; i++) {
            ukuranBak[i] = Double.parseDouble(JOptionPane.showInputDialog("Berapa liter ukuran bak ke-" + (i + 1) + " ?"));
        }

        // Check if the entered day is in the array
        boolean isValidDay = false;
        for (String validDay : hariArray) {
            if (hari.equalsIgnoreCase(validDay)) {
                isValidDay = true;
                break;
            }
        }

        if (!isValidDay) {
            JOptionPane.showMessageDialog(null, "Maaf hari yang anda masukan salah, Coba lagi");
            return;
        }

        double tampungBak = 0;
        for (int i = 0; i < jmlTangki; i++) {
            tampungBak += ukuranBak[i];
            if (tampungBak <= 20) {
                biayaAntar = 10000.0;
            } else if (tampungBak > 20 && tampungBak <= 30) {
                biayaAntar = 7000.0;
            } else {
                biayaAntar = 5000.0;
            }
        }

        switch (hari.toLowerCase()) {
            case "senin":
                pengantar = "Bp.Joko";
                diskon = 0.07;
                break;
            case "selasa":
                pengantar = "Bp.Budi dan Bp.Anto";
                break;
            case "rabu":
                pengantar = "Bp.Anwar";
                diskon = 0.04;
                break;
            case "kamis":
                pengantar = "Bp.Dani dan Bp.Budi";
                break;
            case "jumat":
                pengantar = "Bp.Zul";
                diskon = 0.1;
                break;
            case "sabtu":
                pengantar = "Bp.Riswan";
                break;
        }

        totalHarga = 3500 * tampungBak;
        hargaFix = totalHarga + biayaAntar;
        hargaDiskon = hargaFix * diskon;
        hargaFinal = hargaFix - hargaDiskon;

        JOptionPane.showMessageDialog(null, "Nama Pemesan : " + nama + "\nAlamat Pemesanan : " + alamat + "\nTotal Pemesanan : " + tampungBak
                + "\nHari Pengantaran : " + hari + "\nNama Pengantar : " + pengantar + "\nTotal Biaya : " + hargaFinal + "\nBiaya Antar : " + biayaAntar
                + "\nAnda Hemat : " + hargaDiskon);

        tanya = JOptionPane.showInputDialog("Ingin memesan lagi? (Ya/Tidak)");

        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami :) ");
    }
}
