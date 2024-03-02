package pratikum6_inputOutputJava;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas4 {

    public static void main(String[] args) {
        String nama, nim;
        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir;

        //meminta inputan nama dan nim
        nama = JOptionPane.showInputDialog("Masukan nama anda");
        nim = JOptionPane.showInputDialog("Masukan nim anda");

        //meminta inputan nilaiTugas
        nilaiTugas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Tugas Anda"));
        //meminta inputan nilaiKuis
        nilaiKuis = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Kuis Anda"));
        //meminta inputan nilaiUts
        nilaiUts = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UTS Anda"));
        //meminta inputan nilaiUas
        nilaiUas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai UAS Anda"));

        //proses nilaiAkhir
        nilaiAkhir = (0.20 * nilaiTugas) + (0.20 * nilaiKuis) + (0.30 * nilaiUts) + (0.30 * nilaiUas);

        //output nama. nim, dan nilaiAkhir
        JOptionPane.showMessageDialog(null, "Nama Mahasiswa : " + nama + "\n" + "Nim : "
                + nim + "\n" + "Nilai Akhir : " + nilaiAkhir);

    }
}
