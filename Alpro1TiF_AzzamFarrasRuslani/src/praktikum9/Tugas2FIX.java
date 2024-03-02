package alpro1tif_azzamfarrasruslani;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas2FIX {

    public static void main(String[] args) {
        int i, j, k, n = 5, t;

        for (i = 1; i <= 5; i++) {
            t = n - i;
            for (j = t; j > 0; j--) {
                System.out.print(" ");

            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
