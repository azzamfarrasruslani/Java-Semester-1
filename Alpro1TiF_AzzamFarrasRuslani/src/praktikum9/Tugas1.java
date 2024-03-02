package alpro1tif_azzamfarrasruslani;

/**
 *
 * @author 
 */
public class Tugas1 {

    public static void main(String[] args) {
        int n = 5, i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {

                System.out.print(String.format("%5d", i * j));
            }
            System.out.print("\n");
        }
    }
}
