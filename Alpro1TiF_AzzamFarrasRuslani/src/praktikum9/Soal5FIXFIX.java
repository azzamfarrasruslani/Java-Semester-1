package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 6
 */
public class Soal5FIXFIX {

    public static void main(String[] args) {
        //Deklarasi tipe data
        int noPelanggan, i, hargaBrg, jmlBrg, hargaFinal = 0, hargaFix = 0, 
                uangBayar, kembalian, totalHgBrg, harga;
        String tanggal, metodeBayar, namaDiskon1 = "", namaDiskon2 = "";

        System.out.println("\t\tSupermarket Zigi Zaga \n\t\t    Toko Harian "
                + "\n\t\tJalan Umban Sari No.1 \n\t\t   Pekanbaru, Riau");
        noPelanggan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nomor Pelanggan"));
        tanggal = JOptionPane.showInputDialog("Masukan Tanggal");
        metodeBayar = JOptionPane.showInputDialog("Masukan Metode Pembayaran");
        System.out.println("No. pelanggan : " + noPelanggan);
        System.out.println("Tanggal : " + tanggal + "\t\t\tBayar : " + metodeBayar);
        System.out.println("--------------------------------------------------");
        uangBayar = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Uang"));
        int jmlBelanja = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));

        String tampungBrg = "";
        for (i = 1; i <= jmlBelanja; i++) {
            String namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang ke " + i);

            if (namaBarang.equalsIgnoreCase("Minyak Goreng")) {
                hargaBrg = 12000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang " + namaBarang));
                harga = jmlBrg * hargaBrg;
                if (jmlBrg > 2) {
                    totalHgBrg = (int) (harga - (harga * 0.1));
                    namaDiskon1 = "10%";
                    tampungBrg += namaBarang + "-";
                } else {
                    totalHgBrg = harga;
                }
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t" + hargaBrg + "\t" + totalHgBrg);

                hargaFinal += totalHgBrg;
            } else if (namaBarang.equalsIgnoreCase("Biskuit Roma")) {
                hargaBrg = 5000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang " + namaBarang));
                harga = jmlBrg * hargaBrg;
                if (jmlBrg > 2) {
                    totalHgBrg = (int) (harga - (harga * 0.1));
                    namaDiskon1 = "10%";
                    tampungBrg += namaBarang + "-";
                } else {
                    totalHgBrg = harga;
                }
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t" + hargaBrg + "\t" + totalHgBrg);
                hargaFinal += totalHgBrg;
                
            } else if (namaBarang.equalsIgnoreCase("Tissue Paseo")) {
                hargaBrg = 15000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang " + namaBarang));
                harga = jmlBrg * hargaBrg;
                if (jmlBrg > 2) {
                    totalHgBrg = (int) (harga - (harga * 0.1));
                    namaDiskon1 = "10%";
                    tampungBrg += namaBarang + "-";
                } else {
                    totalHgBrg = harga;
                }
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t" + hargaBrg + "\t" + totalHgBrg);
                hargaFinal += totalHgBrg;
                
            } else if (namaBarang.equalsIgnoreCase("Oreo")) {
                hargaBrg = 10000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang " + namaBarang));
                harga = jmlBrg * hargaBrg;
                if (jmlBrg > 2) {
                    totalHgBrg = (int) (harga - (harga * 0.1));
                    namaDiskon1 = "10%";
                    tampungBrg += namaBarang + "-";
                } else {
                    totalHgBrg = harga;
                }
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t" + hargaBrg + "\t" + totalHgBrg);
                hargaFinal += totalHgBrg;
                
            } else if (namaBarang.equalsIgnoreCase("Tango")) {
                hargaBrg = 8000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang " + namaBarang));
                harga = jmlBrg * hargaBrg;
                if (jmlBrg > 2) {
                    totalHgBrg = (int) (harga - (harga * 0.1));
                    namaDiskon1 = "10%";
                    tampungBrg += namaBarang + "-";
                } else {
                    totalHgBrg = harga;
                }
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t" + hargaBrg + "\t" + totalHgBrg);
                hargaFinal += totalHgBrg;
            }
            
            if (hargaFinal > 50000) {
                hargaFix = (int) (hargaFinal - (hargaFinal * 0.05));
                namaDiskon2 = "5%";
            } else {
                hargaFix = hargaFinal;
            }

        }
        System.out.println("--------------------------------------------------");
        System.out.println("\t\tDiskon :\t" + namaDiskon1 +"-"+ tampungBrg + "\n"+"\t\t"+namaDiskon2);
        System.out.println("\t\tTotal :\t" + hargaFix);
        kembalian = uangBayar - hargaFix;
        System.out.println("\t\tBayar :\t" + uangBayar);
        System.out.println("\t\tKembalian : " + kembalian);

    }
}
