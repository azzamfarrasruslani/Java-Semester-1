/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanArray2;

import javax.swing.JOptionPane;

/**
 *
 * @author 225 - PC 06
 */
public class soal5FIX {

    public static void main(String[] args) {
        int noPelanggan, i, harga, jmlBrg, hargaFinal = 0, diskonJml, hargaAkhir, hargaFix = 0, jmlBarang,totalHarga, uangBayar, kembalian ;
        String tanggal, metodeBayar, namaDiskon1 = null, namaDiskon2 = null;
        System.out.println("\t\tSupermarket Zigi Zaga \n\t\t    Toko Harian \n\t\tJalan Umban Sari No.1 \n\t\t   Pekanbaru, Riau");
        noPelanggan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nomor Pelanggan"));
        tanggal = JOptionPane.showInputDialog("Masukan Tanggal");
        metodeBayar = JOptionPane.showInputDialog("Masukan Metode Pembayaran");
        System.out.println("No. pelanggan : " + noPelanggan);
        System.out.println("Tanggal : " + tanggal + "\t\tBayar : " + metodeBayar);
        System.out.println("\t--------------------------------------------------");
        uangBayar =Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Uang")) ;
        int jmlBelanja = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
        String tampungBrg = "";
        for (i = 1; i <= jmlBelanja; i++) {
            String namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang " + i);

            if (namaBarang.equalsIgnoreCase("Minyak Goreng")) {
                harga = 12000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
                totalHarga = jmlBrg * harga;
                hargaFinal += totalHarga;
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t\t" + hargaFinal);
                tampungBrg += namaBarang;
            } else if (namaBarang.equalsIgnoreCase("Biskuit Roma")) {
                harga = 5000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
                totalHarga = jmlBrg * harga;
                hargaFinal += totalHarga;
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t\t" + hargaFinal);
                tampungBrg += namaBarang;
            } else if (namaBarang.equalsIgnoreCase("Tissue Paseo")) {
                harga = 15000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
                totalHarga = jmlBrg * harga;
                hargaFinal += totalHarga;
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t\t" + hargaFinal);
                tampungBrg += namaBarang;
            } else if (namaBarang.equalsIgnoreCase("Oreo")) {
                harga = 10000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
                totalHarga = jmlBrg * harga;
                hargaFinal += totalHarga;
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t\t" + hargaFinal);
                tampungBrg += namaBarang;
            } else if (namaBarang.equalsIgnoreCase("Tango")) {
                harga = 8000;
                jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
                totalHarga = jmlBrg * harga;
                hargaFinal += totalHarga;
                System.out.println(i + "\t" + namaBarang + "\t\t" + jmlBrg + "\t\t" + hargaFinal);
                tampungBrg += namaBarang;
            }
//            System.out.println("\t--------------------------------------------------");
            if (jmlBelanja > 2) {
                diskonJml = (int) (hargaFinal - (hargaFinal * 0.1));
                hargaAkhir = diskonJml;
                namaDiskon1 = "10%";
            } else {
                hargaAkhir = hargaFinal;
            }

            if (hargaFinal > 50000) {
                hargaFix = (int) (hargaAkhir - (hargaAkhir * 0.05));
                namaDiskon2 = "5%";
            } else {
                hargaFix = hargaAkhir;
            }

        }
        System.out.println("Diskon :" + namaDiskon1 + tampungBrg+ namaDiskon2);
        System.out.println("Total " + hargaFix);
        kembalian = uangBayar - hargaFix;
        System.out.println("Bayar :" + uangBayar);
        System.out.println("Kembalian : " + kembalian);
    }
}
