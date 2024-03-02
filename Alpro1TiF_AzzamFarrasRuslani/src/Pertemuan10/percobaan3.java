package Pertemuan10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class percobaan3 {

    public static void main(String[] args) {
       int i;
       Scanner input = new Scanner(System.in);
       int[] data1 = new int [4];
       String[] data2 = new String[4];
       
       data1 [0] =1;
       data1 [1] =2;
       data1 [3] =4;
       
       
       //Menampilkan elemen array dengan fungsi toString
        System.out.println(Arrays.toString(data1));
        
        System.out.println("Accessing with for");
        for (i = 0 ; i < data1.length;i++) {
            System.out.println("Elemen " + data1[i]);
        }
        
        //Menginput element via looping
        System.out.println();
        System.out.println("Menginput element via looping ");
        for (i = 0; i < data2.length; i++) {
            System.out.println("Masukan element array ke-" + i + ":  ");
            String a = input.next();
            data2[i] = a;
            
        }
        System.out.println("Element-elemen yang ada pada array: ");
        System.out.println(Arrays.toString(data2));
    }
}
