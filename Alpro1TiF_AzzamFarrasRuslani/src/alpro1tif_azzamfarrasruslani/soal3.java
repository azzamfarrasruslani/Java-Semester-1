package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author 225 - PC 06
 */
public class soal3 {

    public static void main(String[] args) {
        String inputKata;

        do {
            int inputJam = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jam Untuk Mengetahui Jadwal Anda"));
            if (inputJam >= 2 && inputJam < 7) {
                JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini DEEP SLEEP");                
            } else if ( inputJam >= 7 && inputJam < 9 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini WAKE UP");  
            } else if ( inputJam >= 9 && inputJam < 12 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini WORK");  
            } else if ( inputJam >= 12 && inputJam < 14 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini LAUNCH");  
            } else if ( inputJam >= 14 && inputJam < 17 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini NAP");  
            } else if ( inputJam >= 17 && inputJam < 19 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini WORKOUT");  
            } else if ( inputJam >= 19 && inputJam < 21 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini DINNER");  
            } else if (inputJam >= 21 && inputJam < 23 ) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini RELAX");  
            } else if ( inputJam >= 23 && inputJam < 2) {
                 JOptionPane.showMessageDialog(null, "Jadwal Anda Hari Ini SLEEP");  
            } else {
                 JOptionPane.showMessageDialog(null, "Jadwal Yang Anda Masukan Salah Coba Lagi");  
            }

            inputKata = JOptionPane.showInputDialog("Apakah anda ingin mengulang program ?");
        } while (inputKata.equalsIgnoreCase("ya"));

    }
}
