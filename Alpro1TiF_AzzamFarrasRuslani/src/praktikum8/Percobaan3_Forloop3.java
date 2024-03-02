package praktikum8;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Percobaan3_Forloop3 {

    public static void main(String[] args) {
       int i;
       
       for (i = 1; i <= 10; i++) {
           if (i % 2 == 0 ) {
               System.out.println( i + " adalah bilangan genap");
           }
           else {
               System.out.println(i + " adalah bilangan ganjil");
           }
       }
    }
}
