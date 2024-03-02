package Pertemuan10;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class percobaan2 {
    public static void main(String[] args) {
        int i,j, elemen;
        int [] a = {13,20,32};
        
        
        // accessing with looping
        System.out.println("Accessing with for-each");
        i = 0;
        
        for (int data: a) {
            elemen = i + 1;
            System.out.println("Elemen " + elemen + ": " + data);
            i++;
        }
        
        
        System.out.println();
        System.out.println("Accessing with for");
        for (j=0 ; j <a.length; j++) {
            System.out.println("Elemen " + a[j]);
        }
    }
}
