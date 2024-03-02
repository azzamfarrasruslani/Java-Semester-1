package pratikum6_inputOutputJava;

import java.util.Scanner;

/**
 *
 *  @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan2 {

    public static void main(String[] args) {
        int myInt1, myInt2, jumlah, kurang;
        String string1, string2, gabungString;

        Scanner input = new Scanner(System.in);

        //Input angka 1
        System.out.print("Masukan angka 1: ");
        myInt1 = input.nextInt();

        //Input angka 2
        System.out.print("Masukan angka 2: ");
        myInt2 = input.nextInt();

        //Input String 1
        System.out.print("Masukan text 1: ");
        input.nextLine();
        string1 = input.nextLine();

        //Input String 2
        System.out.print("Masukan text 2: ");
        string2 = input.nextLine();
        
        
        jumlah=myInt1 + myInt2;
        kurang=myInt1 - myInt2;
        gabungString=string1 + string2;
        
        System.out.println("Jumlah angka yang diinputkan = "+ jumlah);
        System.out.println("Hasil Kurang angka yang diinputkan = "+ kurang);
        System.out.println("Penggabungan string yang diinputkan = "+ gabungString);
    }
}
