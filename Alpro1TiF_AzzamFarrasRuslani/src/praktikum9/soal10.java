package alpro1tif_azzamfarrasruslani;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class soal10 {

    public static void main(String[] args) {
        int diskon = 5000, total = 0, harga = 0, i, jml;
        String waktu, namaPaket = "", paket = "";
        System.out.println(" -----Selamat Datang Di Warnet Nenek Musaropah---------");
        jml = Integer.parseInt(JOptionPane.showInputDialog("Brp Orang Yang Mau Main"));
        paket = JOptionPane.showInputDialog("Mau Paket Apa");
        i = 0;
        do {
            if (paket.equalsIgnoreCase("bronze")) {
                paket = "bronze";
                waktu = "2 jam";
                harga = 10000;
            } else if (paket.equalsIgnoreCase("silver")) {
                paket = "silver";
                waktu = "4 jam";
                harga = 20000;
            } else if (paket.equalsIgnoreCase("gold")) {
                paket = "gold";
                waktu = "6 jam";
                harga = 30000;
            } else {
                JOptionPane.showMessageDialog(null, "paket tdk tersedia");

            }
            i++;

        } while (i >= jml);
        
        total += harga + 0;
        namaPaket += "nama paket :" + paket + "\n";
        int jmlUang = Integer.parseInt(JOptionPane.showInputDialog("masukan jml uang anda"));
        if (jml >= 3) {
            total = total - diskon;
        } else {
            total = total;
        }
        int kembalian = jmlUang - total;
        System.out.println("brp org yang main :" + jml);
        System.out.println(namaPaket);
        System.out.println("total yang anda bayar :" + total);
        System.out.println("uang anda :" + jmlUang);
        System.out.println("kembalian anda :" + kembalian);
    }

}
