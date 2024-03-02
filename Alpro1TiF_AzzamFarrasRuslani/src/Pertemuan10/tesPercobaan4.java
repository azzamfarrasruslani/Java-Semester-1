package Pertemuan10;

//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class tesPercobaan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data2 = new int[4];
        int jumlah = 0;
        double avg;

        for (int i = 0; i <= data2.length - 1; i++) {
            System.out.println("Masukan element array ke-" + i + ":  ");
            int a = input.nextInt();
            data2[i] = a;
            jumlah += data2[i];
        }
        System.out.println("Element-element yang ada pada array:");
//        System.out.println(Arrays.toString(data2));
        int y = 0;
        do {
            System.out.println("Elemen ke-" + y + " : " + data2[y]);
            y++;
        } while (y < data2.length);
        avg = jumlah/data2.length;
        System.out.println("Rata-rata bilangan yang ada pada array: " + avg);
    }
}
