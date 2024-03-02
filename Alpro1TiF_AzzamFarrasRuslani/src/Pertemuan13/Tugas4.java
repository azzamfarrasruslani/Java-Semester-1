package Pertemuan13;

import javax.swing.JOptionPane;
// @author Azzam Farras Ruslani

public class Tugas4 {

    public static void main(String[] args) {

        int jmlMhs = Integer.parseInt(JOptionPane.showInputDialog(
                "Masukan Jumlah Mahasiswa"));
        int tamNilai = 0, tamLulus = 0, tamRevisi = 0;
        String dataMhs[][] = new String[jmlMhs][2];

        for (int i = 0; i < jmlMhs; i++) {
            dataMhs[i][0] = JOptionPane.showInputDialog(
                    "Masukan Nama Mahasiswa ke- " + (i + 1));
            dataMhs[i][1] = JOptionPane.showInputDialog(
                    "Masukan Nilai Mahasiswa");
            int nilai = Integer.parseInt(dataMhs[i][1]);
            tamNilai += nilai;
        }
        System.out.println("Jumlah Mahasiswa : " + jmlMhs);
        int avg = tamNilai / jmlMhs;
        System.out.println("================================="
                + "====================================");
        System.out.printf("| %-15s| %-15s| %-15s| %-15s| \n",
                "No", "Nama", "Nilai", "Keterangan");
        System.out.println("==================================="
                + "==================================");
        for (int i = 0; i < jmlMhs; i++) {
            int nilai = Integer.parseInt(dataMhs[i][1]);
            if (nilai >= avg) {
                System.out.printf("| %-15s| %-15s| %-15s| %-15s| \n",
                        (i + 1), dataMhs[i][0], dataMhs[i][1], "Lulus");
                tamLulus += 1;
            } else {
                System.out.printf("| %-15s| %-15s| %-15s| %-15s| \n",
                        (i + 1), dataMhs[i][0], dataMhs[i][1], "Tidak Lulus");
                tamRevisi += 1;
            }
        }
        System.out.println("======================================"
                + "===============================g");
        System.out.println("Jumlah Mahasiswa Yang Lulus : " + tamLulus);
        System.out.println("Jumlah Mahasiswa Yang Revisi : " + tamRevisi);
        System.out.println("Rata-rata Nilai Kelas : " + avg);

    }
}
