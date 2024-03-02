package praktikum7;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class latihan2 {
    public static void main(String[] args) {
        int bil1 = 7, bil2 = 1, bil3 = 1;
        double rerata;
        
        
        if (bil1 <= bil2) {
            bil1++;
            System.out.println(bil1);
        } else if (bil1 > bil2  && bil1 <= bil3) {
            bil1--;
            System.out.println(bil1);
        } else {
            System.out.println("Bilangan Pertama tetap");
        }
        rerata = (bil1 + bil2 + bil3)/3;
        System.out.println("Rata-rata = " + rerata);
        
        if (rerata % 2 == 0) {
            System.out.println("Nilai Rata-rata merupakan bilangan Genap");
        } else {
            System.out.println("Nilai Rata-rata merupakan bilangan Ganjil");
        }
    }
}
