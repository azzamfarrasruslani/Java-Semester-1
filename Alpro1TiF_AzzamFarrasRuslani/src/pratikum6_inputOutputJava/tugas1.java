package pratikum6_inputOutputJava;

import java.util.Scanner;

/**
 *
 * @author  Azzam Farras Ruslani, 1 TI f
 */
public class tugas1 {

    public static void main(String[] args) {
        int sisi, keliling, alas, tinggi;
        double luas;

        // input sisi untuk mencari keliling segitiga
        Scanner inputKeliling = new Scanner(System.in);
        System.out.println("Masukan sisi untuk mencari keliling segitiga = ");
        sisi = inputKeliling.nextInt();

        // proses mencari keliling segitiga
        keliling = sisi + sisi + sisi;

        //pemanggilan output keliling segitga
        System.out.println("Keliling  segitiga adalah = " + keliling);

        //input alas untuk mencari luas segitiga
        Scanner inputAlas = new Scanner(System.in);
        System.out.println("Masukan alas untuk mencari luas segitiga = ");
        alas = inputAlas.nextInt();

        //input tinggi untuk mencari luas segitiga
        Scanner inputTinggi = new Scanner(System.in);
        System.out.println("Masukan tinggi untuk mencari luas segitiga = ");
        tinggi = inputTinggi.nextInt();

        // proses mecari luas segitiga
        luas = 0.5 * alas * tinggi;

        //pemanggilan output luas segitga
        System.out.println("Luas segitiga adalah = " + luas);
    }
}
