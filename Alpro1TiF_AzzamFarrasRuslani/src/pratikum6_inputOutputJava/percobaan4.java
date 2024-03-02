package pratikum6_inputOutputJava;

import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan4 {

    public static void main(String[] args) {

        String nama, alamat, pekerjaan;
        int umur, tahunLahir;

        //Penggunaan class calendar dari package java.util
        Calendar cal = Calendar.getInstance();

        //Cal.get(Calendar.YEAR)--> untuk mendapatkan tahun sekarang, yaitu 2020
        int tahunSekarang = cal.get(Calendar.YEAR);

        //meminta inputan
        nama = JOptionPane.showInputDialog("Inputkan nama anda");
        alamat = JOptionPane.showInputDialog("Inputkan alamat anda");
        pekerjaan = JOptionPane.showInputDialog("Inputkan pekerjaan anda");

        tahunLahir = Integer.parseInt(JOptionPane.showInputDialog("Inputkan tahun lahir anda"));
        umur = tahunSekarang - tahunLahir;

        JOptionPane.showMessageDialog(null, "Nama Anda: " + nama + "\nAlamat Anda: " + alamat
                + "\nPekerjaan Anda:" + pekerjaan);
        JOptionPane.showMessageDialog(null, "Tahun Lahir Anda: " + tahunLahir + "\nUmur Anda: " + umur);
    }
}
