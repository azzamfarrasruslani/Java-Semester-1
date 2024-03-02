package LatihanUAS;

/**
 *
 * @author AZZAM FARRAS RUSLANI Perulangan
 */
public class Latihan1 {

    public static void main(String[] args) {
                for (int i = 1 ; i<= 5;i++) {
                    for (int j = 1; j<= 5;j++ ) {
                        System.out.print("*");
                       if (i == 2) {
                           
                       }
                    }
                    System.out.println();
                }

        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi; j++) {
                if (i == 1 || i == tinggi || j == 1 || j == tinggi || j == tinggi / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
