package RevisiLaporan;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Pertemuan4Lat1 {

    public static void main(String[] args) {
        double tmpNilai = 0;
        double avg;
        String ulang;
        do {
            String nama = JOptionPane.showInputDialog("Masukan Nama Mahasiswa");
            System.out.println("Nama : " + nama);
            for (int i = 1; i <= 5; i++) {
                int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai ke- " + i));
                tmpNilai += nilai;
            }
            avg = tmpNilai / 5;
            System.out.println("Rata Mahasiswa dengan nama " + nama + " adalah " + avg);
            
            ulang = JOptionPane.showInputDialog("Apakah Ingin Menghitung Rata-Rata mahasiwa lagi Lagi ?");
        } while (ulang.equalsIgnoreCase("Ya"));
    }
}
