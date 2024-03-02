package Pertemuan11;

import javax.swing.JOptionPane;
//@author Azzam Farras Ruslani
public class Soal2 {

    public static void main(String[] args) {
        int jmlData = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Data"));
        int[] nilaiAkhir = new int[jmlData];
        int[] bilGenap = new int[jmlData];
        int[] bilGanjil = new int[jmlData];

        for (int i = 0; i < jmlData; i++) {
            nilaiAkhir[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Akhir ke- " + (i + 1)));

            if (nilaiAkhir[i] % 2 == 0) {
                bilGenap[i] = nilaiAkhir[i] + 2;
            } else {
                bilGanjil[i] = nilaiAkhir[i] * 3;
            }
        }
        System.out.println("Bilangan Genap :");
        for (int bil : bilGenap) {
            if (bil != 0) {
                System.out.print(bil + " ");
            }
        }
        System.out.println();
        System.out.println("Bilangan Ganjil :");
        for (int bil : bilGanjil) {
            if (bil != 0) {
                System.out.print(bil + " ");
            }
        }
    }
}
