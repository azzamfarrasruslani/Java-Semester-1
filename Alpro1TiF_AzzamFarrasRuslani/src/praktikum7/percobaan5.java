package praktikum7;
import java.util.Scanner;
/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan5 {
    public static void main(String[] args) {
        int day;
        
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukan sebuah angka bulat");
        day = myObj.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nomor yang anda masukan lebih besar dari 7");
                break;
        }
    }
}
