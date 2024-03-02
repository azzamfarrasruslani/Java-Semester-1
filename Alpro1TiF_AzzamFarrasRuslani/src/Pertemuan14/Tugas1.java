package Pertemuan14;

import javax.swing.JOptionPane;

//@author AZZAM FARRAS RUSLANI
public class Tugas1 {

    public static void main(String[] args) {

        int jmlMhs = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Mahasiswa"));

        String dataMhs[][] = new String[jmlMhs][6];
        double umur;
        double tmpUmur = 0;
        int tmpPr = 0, tmpLk = 0, tmpTi = 0, tmpSi = 0, tmpTrk = 0;
        int nilai;
        for (int i = 0; i < dataMhs.length; i++) {
            dataMhs[i][0] = JOptionPane.showInputDialog("Masukan Nama Calon Mahasiswa ke- " + (i + 1));
            dataMhs[i][1] = JOptionPane.showInputDialog("Masukan Umur Calon Mahasiswa  " + dataMhs[i][0]);
            umur = Double.parseDouble(dataMhs[i][1]);
            tmpUmur += umur;
            dataMhs[i][2] = JOptionPane.showInputDialog("Masukan Gender Calon Mahasiswa  " + (dataMhs[i][0]));
            dataMhs[i][3] = JOptionPane.showInputDialog("Masukan Nilai Rata2 Calon Mahasiswa  " + (dataMhs[i][0]));
            dataMhs[i][4] = JOptionPane.showInputDialog("Masukan Minat Jurusan Calon Mahasiswa  " + (dataMhs[i][0]));

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
        System.out.println("\t\t\t\t\t\tData Calon Mahasiswa JTI");
        System.out.println("=============================================="
                + "=========================================================================");
        System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                "No", "Nama", "Umur", "Gender", "Nilai", "Minat", "Keterangan");
        System.out.println("=============================================="
                + "=========================================================================");

        for (int i = 0; i < jmlMhs; i++) {
            System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                    (i + 1), dataMhs[i][0], dataMhs[i][1], dataMhs[i][2], dataMhs[i][3], dataMhs[i][4], dataMhs[i][5]);
        }

        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\tPresentase Calon Mahasiswa JTI");
        System.out.println("=============================================="
                + "========================================================");
        System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                "Rata-rata Umur", " Jml LK", "Jml Prm",
                "Peminat Ti", "Peminat Si", "Peminat Trk");
        System.out.println("=============================================="
                + "========================================================");

        System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                avgUmur, tmpLk, tmpPr, tmpTi, tmpSi, tmpTrk);

        System.out.println("\n\n\n");

        String nama;
        String tanya;
        System.out.println("\t\t\t\t\t\tPecarian Calon Mahasiswa JTI");
        System.out.println("=============================================="
                + "=========================================================================");
        System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                "No", "Nama", "Umur", "Gender", "Nilai", "Minat", "Keterangan");
        System.out.println("=============================================="
                + "=========================================================================");

        do {
            nama = JOptionPane.showInputDialog("Nama Orang Yang Akan Dicari ");
            boolean ada = false;
            for (int i = 0; i < jmlMhs; i++) {
                if (dataMhs[i][0].equalsIgnoreCase(nama)) {
                    System.out.printf("|%-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                            (i + 1), dataMhs[i][0], dataMhs[i][1], dataMhs[i][2], dataMhs[i][3], dataMhs[i][4], dataMhs[i][5]);
                    ada = true;
                    break;
                }
            }
            if (!ada) {
                JOptionPane.showMessageDialog(null, "Nama Tidak Ditemukan dalam data calon Mahasiswa");
            }
            tanya = JOptionPane.showInputDialog("Apakah anda ingin mencari data calon Mahasiswa lagi ? [ya/tidak]");
        } while (tanya.equalsIgnoreCase("ya"));
    }
}
