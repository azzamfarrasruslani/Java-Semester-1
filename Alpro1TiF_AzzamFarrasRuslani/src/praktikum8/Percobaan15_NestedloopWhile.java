package praktikum8;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Percobaan15_NestedloopWhile {

    public static void main(String[] args) {
        int i, j;
        i = 1;

        while (i <= 10) {
            j=1;
            while (j <= i) {
                System.out.print(j);
                j+=1;
            }
            System.out.println("");
            i++;
        }
    }
}
