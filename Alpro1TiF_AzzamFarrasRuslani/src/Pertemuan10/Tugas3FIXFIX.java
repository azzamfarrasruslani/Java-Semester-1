package Pertemuan10;

import javax.swing.JOptionPane;
//@author AZZAM FARRAS RUSLANI//
public class Tugas3FIXFIX {

    public static void main(String[] args) {
        int jmlData = Integer.parseInt(JOptionPane.showInputDialog(
                "Masukan Jumlah Mahasiswa"));
        String[][] dataMahasiswa = new String[jmlData][3];
        System.out.println("Masukan Jumlah Mahasiswa : " 
                + jmlData + "\n\n");
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            dataMahasiswa[i][0] = JOptionPane.showInputDialog(
                    "Masukan NIM");
            System.out.println("NIM : " + dataMahasiswa[i][0]);
            dataMahasiswa[i][1] = JOptionPane.showInputDialog(
                    "Masukan Nama");
            System.out.println("Nama : " + dataMahasiswa[i][1]);
            dataMahasiswa[i][2] = JOptionPane.showInputDialog(
                    "Masukan Jurusan");
            System.out.println("Jurusan : " + dataMahasiswa[i][2]);
        }
        System.out.println("Data Mahasiswa Yang Dimasukan");
        System.out.println("-------------------------------------"
                + "-------");
        System.out.printf(" %-15s  %-15s  %-20s \n", "Nim", 
                "Nama", "Jurusan");

        for (int j = 0; j < jmlData; j++) {
            System.out.printf(" %-15s  %-15s  %-20s \n", 
                    dataMahasiswa[j][0], dataMahasiswa[j][1], dataMahasiswa[j][2]);
        }
    }
}
