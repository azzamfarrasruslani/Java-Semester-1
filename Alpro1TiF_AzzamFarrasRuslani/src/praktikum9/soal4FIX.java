package alpro1tif_azzamfarrasruslani;

/**
 *
 * @author Kelompok 6
 */
public class soal4FIX {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            System.out.println("Loyang " + i + ":");
            System.out.println("---------------------");
            for (k = 1; k <= 4; k++) {
                for (j = 1; j <= 4; j++) {
                    System.out.print("   ");
                    switch (j) {
                        case 1:
                            System.out.print("*");
                            break;
                        case 2:
                            System.out.print("O");
                            break;
                        case 3:
                            System.out.print("#");
                            break;
                        default:
                            System.out.println("X");
                            break;
                    }
                }
            }
            System.out.println("---------------------");
        }
    }
}
