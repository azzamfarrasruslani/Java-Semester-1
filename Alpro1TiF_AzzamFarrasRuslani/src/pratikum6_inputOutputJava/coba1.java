package pratikum6_inputOutputJava;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI , 1 TI F
 */
public class coba1 {

    public static void main(String[] args) {
        int sisi, keliling, alas, tinggi;
        double luas;
        String menu1= "keliling", menu2= "luas";

        // input menu untuk mencari keliling dan luas segitiga
        Scanner inputMenu = new Scanner(System.in);
        System.out.println("Masukan pilihan menu");
        inputMenu.nextLine();

        if ("keliling".equals(menu1)) {
            // input sisi untuk mencari keliling segitiga
            Scanner inputKeliling = new Scanner(System.in);
            System.out.println("Masukan sisi untuk mencari keliling segitiga = ");
            sisi = inputKeliling.nextInt();

            // proses mencari keliling segitiga
            keliling = sisi + sisi + sisi;

            //pemanggilan output keliling segitga
            System.out.println("Keliling  segitiga adalah = " + keliling);

        } else if ("luas".equals(menu2)) {
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

        } else {
            System.out.println("Menu yang anda masukan salah");
        }
    }
}
