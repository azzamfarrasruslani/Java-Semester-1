package LatihanUAS_Teori;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan7 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
                System.out.println();
            }

        }
        for (int i = 0; i < 0 ; i++) {
            for(int j = 0 ; j< 4;j++) {
                if (j<i) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
