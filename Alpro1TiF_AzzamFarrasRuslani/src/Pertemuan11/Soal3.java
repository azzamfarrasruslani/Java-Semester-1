package Pertemuan11;

import java.util.Arrays;
import java.util.Scanner;

//@author Azzam Farras Ruslani
public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Array : ");
        int jmlData = input.nextInt();
        String[] bilBulat = new String[jmlData];

        System.out.println("Menginput element via looping ");
        for (int i = 0; i < bilBulat.length; i++) {
            System.out.print("Masukan element array ke-" + i + ":  ");
            String a = input.next();
            bilBulat[i] = a;

        }
        System.out.println("Element-elemen yang ada pada array: ");
        System.out.println(Arrays.toString(bilBulat));
        System.out.print("Masukan bilangan yang ingin di hapus : ");
        String hapusBil = input.next();

        for (int i = 0; i < bilBulat.length; i++) {
            bilBulat[i] = bilBulat[i].replaceAll(hapusBil, "0");
        }

        System.out.print("Sisa Data Setelah Di Hapus:");
        System.out.println(Arrays.toString(bilBulat));

    }
}
