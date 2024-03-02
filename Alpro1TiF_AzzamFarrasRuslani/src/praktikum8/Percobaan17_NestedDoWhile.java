package praktikum8;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Percobaan17_NestedDoWhile {
    public static void main(String[] args) {
        int i, j;
        i=1;
        
        do {
            j = 1;
            do {
                System.out.println(j);
                j++;
            } 
            while (j <= 3);
            System.out.println("");
            i++;
        }
        while (i <= 3);
    }
}
