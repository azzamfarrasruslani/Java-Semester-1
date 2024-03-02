package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 6
 */
public class soal2FIXFIX {

    public static void main(String[] args) {
        String hari, nama, alamat, pengantar = null, tanya;
        int jmlTangki, i;
        double ukuranBak, hargaFinal = 0.0, totalHarga , biayaAntar = 0, diskon = 0.0, hargaDiskon = 0, hargaFix;
        hari = JOptionPane.showInputDialog("Selamat Datang di Toko Air Berkarya\nUntuk hari apa pesanannya ?");
        nama = JOptionPane.showInputDialog("Masukan nama pemesan");
        alamat = JOptionPane.showInputDialog("Masukan alamat pesanan");
        jmlTangki = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah bak/tangki yang anda miliki?"));
        do {
            double tampungBak = 0;
            for (i = 1; i <= jmlTangki; i++) {
                ukuranBak = Double.parseDouble(JOptionPane.showInputDialog("Berapa liter ukuran bak ke-" + i + " ?"));
                tampungBak += ukuranBak;
                if (tampungBak <= 20) {
                    biayaAntar = 10000.0;
                } else if (tampungBak > 20 && tampungBak <= 30) {
                    biayaAntar = 7000.0;
                } else {
                    biayaAntar = 5000.0;
                }

                switch (hari) {
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
                    default:
                        JOptionPane.showMessageDialog(null, "Maaf hari yang anda masukan salah, Coba lagi");
                        break;
                }

                totalHarga = 3500 * tampungBak;
                hargaFix = totalHarga + biayaAntar;
                hargaDiskon = hargaFix * diskon;
                hargaFinal = hargaFix - hargaDiskon;
            }
            JOptionPane.showMessageDialog(null, "Nama Pemesan : " + nama + "\nAlamat Pemesanan : " + alamat + "\nTotal Pemesanan : " + tampungBak
                    + "\nHari Pengantaran : " + hari + "\nNama Pengantar : " + pengantar + "\nTotal Biaya : " + hargaFinal + "\nBiaya Antar : " + biayaAntar +
                    "\nAnda Hemat : " + hargaDiskon);

            tanya = JOptionPane.showInputDialog("Ingin memesan lagi?(Ya/Tidak)");
        } while (tanya.equalsIgnoreCase("Ya"));
        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Mengunjungi Toko Kami :) ");
    }
}
