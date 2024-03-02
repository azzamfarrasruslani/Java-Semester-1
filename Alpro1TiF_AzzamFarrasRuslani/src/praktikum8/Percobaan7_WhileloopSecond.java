package praktikum8;
import java.util.Scanner;
/**
 *
 * @author 225 - PC 04
 */
public class Percobaan7_WhileloopSecond {
    public static void main(String[] args) {
        
        int jumlah = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukan sebuah bilangan bulat : ");
        int number = input.nextInt();
        
        
        while (number >= 0){
            jumlah += number;
            
            System.out.println("Masukan sebuah bilangan bulat: ");
            number = input.nextInt();
        }
        System.out.println("Jumlah total bilangan positif yang diinputkan " + jumlah);
    }
}
