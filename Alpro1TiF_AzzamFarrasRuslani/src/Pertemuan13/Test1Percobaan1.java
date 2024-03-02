package Pertemuan13;

// @author Azzam Farras Ruslani
public class Test1Percobaan1 {

    public static void main(String[] args) {
        int[][] data = {
            {10, 20, 30},
            {40, 50, 60, 70},
            {10, 45, 67}
        };
        System.out.println("Mengakses dan menampilkan elemenn array tanpa looping");
        System.out.println(data[0][0]);
        System.out.println(data[0][1]);
        System.out.println(data[0][2]);
        System.out.println(data[1][0]);
        System.out.println(data[1][1]);
        System.out.println(data[1][2]);
        System.out.println(data[1][3]);
        System.out.println(data[2][0]);
        System.out.println(data[2][1]);
        System.out.println(data[2][2]);

        System.out.println("Mengaksesj dan menampikan elemen array dengan looping");
        for (int[] data1 : data) {
            for (int j = 0; j < data1.length; j++) {
                System.out.println(data1[j]);
            }
        }
    }
}
