package LatihanArray2;

import java.util.Arrays;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas2 {

    public static void main(String[] args) {
        int[] dataArray = {5, 3, 1, 6, 7};

        Arrays.sort(dataArray);

        System.out.println("Array setelah diurutkan:");

        for (int num : dataArray) {
            System.out.print(num + " ");
        }

    }
}
