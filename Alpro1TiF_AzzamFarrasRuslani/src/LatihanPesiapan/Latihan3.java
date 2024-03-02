package LatihanPesiapan;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan3 {

    public static void main(String[] args) {
        int size = 3;
        // deklarasi var array nilai
        int nilai[] = new int[size];
        // deklarasi var array nama
        String nama[] = new String[size];

        // perulangan untuk menginput nilai dan nama
        Scanner obj = new Scanner(System.in);

        int max = nilai[0];
        String tmpnama = "";

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan Nama Mahasiswa ke- " + (i + 1) + " : ");
            nama[i] = obj.next();

            System.out.print("masukkan nilai Mahasiswa " + nama[i] + " : ");
            nilai[i] = obj.nextInt();
            System.out.println();

        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
                tmpnama = nama[i];
            }
        }
        System.out.println("Nilai tertinggi adalah :" + max + "nama :" + tmpnama);
        
      

    }
}
