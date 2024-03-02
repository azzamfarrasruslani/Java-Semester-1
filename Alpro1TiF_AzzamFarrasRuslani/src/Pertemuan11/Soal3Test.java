package Pertemuan11;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Soal3Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlData = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Bilangan Bulat"));
        String[] bilBulat = new String[jmlData];

        System.out.println("Menginput elemen via looping ");
        for (int i = 0; i < bilBulat.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            String a = input.next();
            bilBulat[i] = a;
        }

        System.out.println("Elemen-elemen yang ada pada array: ");
        System.out.println(Arrays.toString(bilBulat));

        String hapusBil = JOptionPane.showInputDialog("Index berapa yang mau dihapus ?");
        int indexToDelete = Integer.parseInt(hapusBil);

        // Validating index to avoid ArrayIndexOutOfBoundsException
        if (indexToDelete >= 0 && indexToDelete < bilBulat.length) {
            bilBulat[indexToDelete] = "0";
            System.out.println("Elemen pada index " + indexToDelete + " berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }

        System.out.println("Elemen-elemen setelah penghapusan: ");
        System.out.println(Arrays.toString(bilBulat));
    }
}
