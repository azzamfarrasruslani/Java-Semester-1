package pratikum6_inputOutputJava;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslni, 1 TI F
 */
public class latihan {

    public static void main(String[] args) {

        int harga_bembeng = 5000, harga_cola = 7000, harga_gorengan = 1500, jml_bembeng, jml_cola, jml_gorengan, total_harga;

        // input bembeng
        Scanner jumlah1 = new Scanner(System.in);
        System.out.println("masukan jumlah bembeng :");
        jml_bembeng = jumlah1.nextInt();

        // input cola
        Scanner jumlah2 = new Scanner(System.in);
        System.out.println("masukan jumlah cola :");
        jml_cola = jumlah2.nextInt();

        //input gorengan
        Scanner jumlah3 = new Scanner(System.in);
        System.out.println("masukan jumlah gorangan :");
        jml_gorengan = jumlah3.nextInt();

        //proses
        total_harga = (harga_bembeng * jml_bembeng) + (harga_cola * jml_cola) + (harga_gorengan * jml_gorengan);

        //output
        System.out.println("Total hatga RP. " + total_harga);

    }
}
