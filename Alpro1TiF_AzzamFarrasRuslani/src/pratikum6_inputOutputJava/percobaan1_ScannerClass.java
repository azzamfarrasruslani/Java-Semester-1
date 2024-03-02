package pratikum6_inputOutputJava;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan1_ScannerClass {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //Meminta inputan string
        System.out.print("Masukan username: ");
        String userName = myObj.nextLine();

        //Meminta inputan double 
        System.out.print("Masukan angka desimal: ");
        double doubleNum = myObj.nextDouble();

        //Meminta inputan integer
        System.out.print("Masukan angka bulat: ");
        int intNum = myObj.nextInt();

        System.out.println("Username yang anda inputkan: " + userName);
        System.out.println("Angka desimal yang anda inputkan: " + doubleNum);
        System.out.println("Angka bulat yang anda inputkan: " + intNum);

    }
}
