package LatihanArray;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Lat2 {

    public static void main(String[] args) {
        int jmlSiswa = 2;
        String nama[] = new String[jmlSiswa];
        int umur[] = new int[jmlSiswa];

        for (int i = 0; i < jmlSiswa; i++) {
            nama[i] = JOptionPane.showInputDialog("Masukan nama siswa");
            umur[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan umur siswa"));
        }
        System.out.printf("%-15s %-15s %-15s\n", "No", "Nama", "Umur");
        for (int j = 0; j < jmlSiswa; j++) {

            System.out.printf("%-15s %-15s %-15s\n", (j + 1), nama[j], umur[j]);
        }

    }
}
