package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class soal2fix {

    public static void main(String[] args) {
        String hari, nama, alamat, pengantar = null, tanya;
        int jmlTangki, i;
        double ukuranBak, harga, hargaFinal, hargaFix = 0, totalHarga, biayaAntar;

        hari = JOptionPane.showInputDialog("Selamat Datang di Toko Air Berkarya\nUntuk hari apa pesanannya ?");
        nama = JOptionPane.showInputDialog("Masukan nama pemesan");
        alamat = JOptionPane.showInputDialog("Masukan alamat pesanan");

        jmlTangki = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah bak yang anda miliki?"));
        double tampungBak = 0;
        double tampungHarga = 0;
        double tampungDiskon = 0;
        do {
            for (i = 1; i <= jmlTangki; i++) {
                double diskon = 0;
                ukuranBak = Double.parseDouble(JOptionPane.showInputDialog("Berapa liter ukuran bak ke-" + i + " ?"));
                tampungBak += ukuranBak;
                switch (hari) {
                    case "senin":
                        pengantar = "Bp.Joko";
//                        harga = ukuranBak * 3500;
                        harga = tampungBak * 3500;
                        diskon = harga * 0.07;
                         
//                        tampungDiskon += diskon;
                        hargaFinal = harga - diskon;
                        hargaFix = hargaFinal;
                        tampungHarga += hargaFix;
                        break;
                    case "selasa":
                        pengantar = "Bp.Budi dan Bp.Anto";
                        harga = ukuranBak * 3500;
                        hargaFix = harga;
                        tampungHarga += hargaFix;
                        break;
                    case "rabu":
                        pengantar = "Bp.Anwar";
                        harga = ukuranBak * 3500;
                        diskon = harga * 0.04;
//                        tampungDiskon += diskon;
                        hargaFinal = harga - diskon;
                        hargaFix = hargaFinal;
                        tampungHarga += hargaFix;
                        break;
                    case "kamis":
                        pengantar = "Bp.Dani dan Bp.Budi";
                        harga = ukuranBak * 3500;
                        hargaFix = harga;
                        tampungHarga += hargaFix;
                        break;
                    case "jumat":
                        pengantar = "Bp.Zul";
                        harga = ukuranBak * 3500;
                        diskon = harga * 0.1;
//                        tampungDiskon += diskon;
                        hargaFinal = harga - diskon;
                        hargaFix = hargaFinal;
                        tampungHarga += hargaFix;
                        break;
                    case "sabtu":
                        pengantar = "Bp.Riswan";
                        harga = ukuranBak * 3500;
                        hargaFix = harga;
                        tampungHarga += hargaFix;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Maaf hari yang anda masukan salah, Coba lagi");
                        break;
                }
                tampungDiskon += diskon;
            }
            if (tampungBak <= 20) {
                biayaAntar = 10000;
                totalHarga = 10000 + tampungHarga;

            } else if (tampungBak > 20 && tampungBak <= 30) {
                biayaAntar = 7000;
                totalHarga = 7000 + tampungHarga;

            } else {
                biayaAntar = 5000;
                totalHarga = 5000 + tampungHarga;

            }
            System.out.println(nama);
            System.out.println(alamat);
            System.out.println(tampungBak);
            System.out.println(hari);
            System.out.println(pengantar);
            System.out.println(totalHarga);
            JOptionPane.showMessageDialog(null, totalHarga);
            System.out.println(biayaAntar);
            System.out.println(tampungDiskon);
            tanya = JOptionPane.showInputDialog("Ingin memesan lagi?(Ya/Tidak)");
        } while (tanya.equalsIgnoreCase("Ya"));

    }
}
