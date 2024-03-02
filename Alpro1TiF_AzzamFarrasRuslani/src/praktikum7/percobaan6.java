package praktikum7;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan6 {

    public static void main(String[] args) {
        int bilangan1, bilangan2;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukan angka pertama");
        bilangan1 = myObj.nextInt();

        System.out.println("Masukan angka kedua");
        bilangan2 = myObj.nextInt();

        switch (bilangan1) {
            case 1:
                switch (bilangan2) {
                    case 10:
                        System.out.println(bilangan1 + " bernilai 1 dan" + bilangan2 + " bernilai 10");
                        break;
                    case 20:
                        System.out.println(bilangan1 + " bernilai 1 dan" + bilangan2 + " bernilai 20");
                        break;
                    default:
                        System.out.println(bilangan1 + " bernilai 1 dan" + bilangan2 + " bernilai lebih dari 20");
                        break;
                }
                break;
            case 2:
                System.out.println("i bernilai 2");
                break;
            case 3:
                System.out.println("i bernilai 3");
                break;
            default:
                System.out.println("Bilangan pertama yang anda masukan lebih besar dari 7");
                break;

        }
    }
}
