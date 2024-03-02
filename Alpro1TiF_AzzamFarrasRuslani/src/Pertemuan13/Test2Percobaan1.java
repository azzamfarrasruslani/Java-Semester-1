package Pertemuan13;

// @author Azzam Farras Ruslani
public class Test2Percobaan1 {

    public static void main(String[] args) {
        int[][] data = {
            {10, 20, 30},
            {40, 50, 60, 70}};

        System.out.println("Mengakses dan menampilkan elemenn array tanpa looping");
        System.out.println(data[1][0]);
        System.out.println(data[1][1]);
        System.out.println(data[1][2]);
        System.out.println(data[1][3]);

        System.out.println("Mengaksesj dan menampikan elemen array dengan looping");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}
