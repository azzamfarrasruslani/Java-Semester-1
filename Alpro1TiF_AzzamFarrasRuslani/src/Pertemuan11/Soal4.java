package Pertemuan11;

//@author Azzam Farras Ruslani
import javax.swing.JOptionPane;

public class Soal4 {

    public static void main(String[] args) {
        String hari, nama, alamat, pengantar = null, tanya, namaHari = null;
        int jmlTangki;
        double[] ukuranBak;
        double hargaFinal, totalHarga, biayaAntar = 0, diskon = 0.0, hargaDiskon, hargaFix;
        String[] hariArray = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu"};

        hari = JOptionPane.showInputDialog("Selamat Datang di Toko Air "
                + "Berkarya\nUntuk hari apa pesanannya?");
        nama = JOptionPane.showInputDialog("Masukan nama pemesan");
        alamat = JOptionPane.showInputDialog("Masukan alamat pesanan");
        jmlTangki = Integer.parseInt(JOptionPane.showInputDialog(
                "Berapa jumlah bak/tangki yang anda miliki?"));

        ukuranBak = new double[jmlTangki];

        for (int i = 0; i < jmlTangki; i++) {
            ukuranBak[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Berapa liter ukuran bak ke-" + (i + 1) + " ?"));
            System.out.println("Ukuran Bak ke- " + (i + 1)
                    + " Yang Telah Dimasukan : " + ukuranBak[i] + ",");
        }

        do {
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
                    namaHari = hariArray[0];
                    break;
                case "selasa":
                    pengantar = "Bp.Budi dan Bp.Anto";
                    namaHari = hariArray[1];
                    break;
                case "rabu":
                    pengantar = "Bp.Anwar";
                    diskon = 0.04;
                    namaHari = hariArray[2];
                    break;
                case "kamis":
                    pengantar = "Bp.Dani dan Bp.Budi";
                    namaHari = hariArray[3];
                    break;
                case "jumat":
                    pengantar = "Bp.Zul";
                    diskon = 0.1;
                    namaHari = hariArray[4];
                    break;
                case "sabtu":
                    pengantar = "Bp.Riswan";
                    namaHari = hariArray[5];
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Maaf hari yang anda masukan salah, Coba lagi");
                    break;
            }

            totalHarga = 3500 * tampungBak;
            hargaFix = totalHarga + biayaAntar;
            hargaDiskon = hargaFix * diskon;
            hargaFinal = hargaFix - hargaDiskon;

            System.out.println("Nama Pemesan : " + nama + "\nHari Pemesanan : " + namaHari
                    + "\nAlamat Pemesanan : " + alamat + "\nTotal Pemesanan : " + tampungBak
                    + "\nHari Pengantaran : " + hari + "\nNama Pengantar : " + pengantar
                    + "\nTotal Biaya : " + hargaFinal + "\nBiaya Antar : " + biayaAntar
                    + "\nAnda Hemat : " + hargaDiskon);

            tanya = JOptionPane.showInputDialog("Ingin memesan lagi? (Ya/Tidak)");
        } while (tanya.equalsIgnoreCase("Ya"));

        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami :) ");
    }
}
