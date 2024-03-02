package LatihanPesiapan;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan6 {

    public static void main(String[] args) {

        int jmlMhs = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Mahasiswa"));

        String dataMhs[][] = new String[jmlMhs][6];
        double umur;
        double tmpUmur = 0;
        int tmpPr = 0, tmpLk = 0, tmpTi = 0, tmpSi = 0, tmpTrk = 0;
        int nilai;
        for (int i = 0; i < dataMhs.length; i++) {
            dataMhs[i][0] = JOptionPane.showInputDialog("Masukan Nama Calon Mahaasiswa ke- " + (i + 1));
            dataMhs[i][1] = JOptionPane.showInputDialog("Masukan Umur Calon Mahaasiswa ke- " + (i + 1));
            umur = Double.parseDouble(dataMhs[i][1]);
            tmpUmur += umur;
            dataMhs[i][2] = JOptionPane.showInputDialog("Masukan Gender Calon Mahaasiswa ke- " + (i + 1));
            dataMhs[i][3] = JOptionPane.showInputDialog("Masukan Nilai Rata2 Calon Mahaasiswa ke- " + (i + 1));
            dataMhs[i][4] = JOptionPane.showInputDialog("Masukan Minat Jurusan Calon Mahaasiswa ke- " + (i + 1));

            if (dataMhs[i][2].equalsIgnoreCase("Pr")) {
                tmpPr++;
            } else {
                tmpLk++;
            }

            nilai = Integer.parseInt(dataMhs[i][3]);
            if (dataMhs[i][4].equalsIgnoreCase("Ti")) {
                tmpTi++;
                if (nilai > 70) {
                    dataMhs[i][5] = "Lulus";
                } else {
                    dataMhs[i][5] = "Tidak lulus";
                }
            } else if (dataMhs[i][4].equalsIgnoreCase("Si")) {
                tmpSi++;
                if (nilai > 60) {
                    dataMhs[i][5] = "Lulus";
                } else {
                    dataMhs[i][5] = "Tidak lulus";
                }
            } else {
                tmpTrk++;
                if (nilai > 65) {
                    dataMhs[i][5] = "Lulus";
                } else {
                    dataMhs[i][5] = "Tidak lulus";
                }
            }
        }

        double avgUmur = tmpUmur / jmlMhs;
        
        
        System.out.println("=============================================="
                + "==================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", 
                "No", "Nama", "Umur", "Gender", "Nilai","Minat", "Keterangan");
        System.out.println("=============================================="
                + "==================================================");

        for (int i = 0; i < jmlMhs; i++) {
            
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", 
                    (i + 1), dataMhs[i][0], dataMhs[i][1], dataMhs[i][2], dataMhs[i][3], dataMhs[i][4],dataMhs[i][5]);

        }
        
        
        
        System.out.println("Rata-rata Umur Calon Mahasiswa : " + avgUmur);
        System.out.println("Jumlah Pendaftar Laki-Laki : " + tmpLk );
        System.out.println("Jumlah Pendaftar Perempuan : " + tmpPr );
        System.out.println("Jumlah Peminat Jurusan Ti : " + tmpTi);
        System.out.println("Jumlah Peminat Jurusan Si : " + tmpSi);
        System.out.println("Jumlah Peminat Jurusan Trk: " + tmpTrk);
    }
}
