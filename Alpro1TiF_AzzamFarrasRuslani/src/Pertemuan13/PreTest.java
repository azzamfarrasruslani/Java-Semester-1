package Pertemuan13;

import javax.swing.JOptionPane;

/**
 *
 * @author 225 - PC 06
 */
public class PreTest {

    public static void main(String[] args) {
        int jmlTamu = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah calon pendaftar"));
        String[] nama = new String[jmlTamu];
        String[] gender = new String[jmlTamu];
        String[] jurusan = new String[jmlTamu];
        int[] umur = new int[jmlTamu];
        int[] avg = new int[jmlTamu];
        int tampungUmur = 0;
        int avgUmur;
        int jmlPr = 0, jmlLk = 0, jmlTI = 0, jmlSi = 0, jmlTrk = 0;
        for (int i = 0; i < jmlTamu; i++) {
            nama[i] = JOptionPane.showInputDialog("Masukan nama siswa ke- " + (i + 1));
            gender[i] = JOptionPane.showInputDialog("Masukan Jenis Kelamin");
            jurusan[i] = JOptionPane.showInputDialog("Masukan minat jurusan");
            umur[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan umur"));
            avg[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai rata-rata raport"));
            tampungUmur += umur[i];
            if (gender[i].equalsIgnoreCase("Pr")) {
                jmlPr += 1;
            } else {
                jmlLk += 1;
            }

            if (jurusan[i].equalsIgnoreCase("Ti")) {
                jmlTI += 1;
            } else if (jurusan[i].equalsIgnoreCase("Si")) {
                jmlSi += 1;
            } else {
                jmlTrk += 1;
            }
        }
        System.out.printf("%-15s| %-15s| %-15s| %-15s| %-15s| \n", 
                "Nama Siswa", "Umur", "Gender", "Nilai Rata2 Raport", "Minat Jurusan");

        System.out.println("===================================================="
                + "=====================================");
        for (int i = 0; i < jmlTamu; i++) {
            System.out.printf("%-15s| %-15s| %-15s| %-15s| %-15s| \n", 
                    nama[i], umur[i], gender[i], avg[i], jurusan[i]);
        }
        System.out.println();
        avgUmur = tampungUmur / jmlTamu;
        System.out.println("Rata-rata Umur Siswa : " + avgUmur);
        System.out.println("Pendaftar Perempuan Sebanyak : " + jmlPr);
        System.out.println("Pendaftar Laki-laki Sebanyak : " + jmlLk);
        System.out.println("Jumlah peminat jurusan Ti Sebanyak : " + jmlTI);
        System.out.println("Jumlah peminat jurusan Si Sebanyak : " + jmlSi);
        System.out.println("Jumlah peminat jurusan Trk Sebanyak : " + jmlTrk);

        System.out.println();
        System.out.println("Data Calon Mahasiswa ");
        for (int j = 0; j < jmlTamu; j++) {
            if (avg[j] >= 70 && jurusan[j].equalsIgnoreCase("Ti")) {
                System.out.println(nama[j] + " Dengan Jurusan Ti dinyatakan Lulus");
            } else if (avg[j] >= 60 && jurusan[j].equalsIgnoreCase("Si")) {
                System.out.println(nama[j] + " Dengan Jurusan Si dinyatakan Lulus");
            } else if (avg[j] >= 65 && jurusan[j].equalsIgnoreCase("Trk")) {
                System.out.println(nama[j] + " Dengan Jurusan Trk dinyatakan Lulus");
            } else {
                System.out.println(nama[j] + "Maaf anda tidak dinyatakan lulus");
            }
        }

    }
}
