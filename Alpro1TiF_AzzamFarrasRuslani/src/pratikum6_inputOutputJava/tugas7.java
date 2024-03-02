package pratikum6_inputOutputJava;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas7 {

    public static void main(String[] args) {
        String hari, belajar, nama, kota, kampus;
        int umur, umurNanti;

        // Inputan hari
        hari = JOptionPane.showInputDialog("Masukan hari ini hari apa ?");
        // Inputan belajar
        belajar = JOptionPane.showInputDialog("Saya belajar ?");
        //Inputan umur
        umur = Integer.parseInt(JOptionPane.showInputDialog("Umur kamu berapa ?"));
        //proses umur 2 tahun lagi
        umurNanti = umur + 2;
        // Inputan nama
        nama = JOptionPane.showInputDialog("Masukan nama anda ");
        // Inputtan kota
        kota = JOptionPane.showInputDialog("Kota tempat tinggal kamu ?");
        // Inputan kampus
        kampus = JOptionPane.showInputDialog("Masukan nama kampus ");

        // Output
        System.out.println("\tHari ini adalah hari " + hari
                + " Saya sedang belajar di " + belajar + ". Saat ini saya sedang belajar bahasa pemograman JAVA. \nOiya perkenalkan nama saya "
                + nama + ". Umur saya " + umur + " tahun. 2 tahun lagi umur saya " + umurNanti + " tahun. Saya tinggal di kota "
                + kota + ".\nSaat ini saya belajar di kampus " + kampus
                + ". Saya senang belajar di kamus ini, karena memberikan saya ilmu tentang teknologi.\nSekian Terimakasih");
    }
}
