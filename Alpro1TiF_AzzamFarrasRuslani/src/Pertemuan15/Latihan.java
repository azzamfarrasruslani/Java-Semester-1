package Pertemuan15;

import java.util.Scanner;

/**
 *
 * @author 225 - PC 06
 */
public class Latihan {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukan banyak akun : ");
        int bnykakun = input.nextInt();
        String data[][] = new String[bnykakun][3];
        String passBenar = "123456";
        for (int i = 0; i < bnykakun; i++) {
            System.out.println("Masukan username");
            data[i][0] = input.next();
            System.out.println("Masukan gender");
            data[i][1] = input.next();
            try {
            System.out.println("Masukan Password akun " + data[i][0]);
            data[i][2] = input.next();
            
            if (data[i][2].length()>6) {
               throw new Exception();
            }
            } catch (Exception er){
                 System.out.println("Password Salah, Masukan Password lagi");
                data[i][2] = input.next();
            }
            
            
       
//            do {
//                System.out.println("Password Salah, Masukan Password lagi");
//                data[i][2] = input.nextLine();
//            } while (!data[i][2].equalsIgnoreCase(passBenar));

            System.out.println("User name : " + data[i][0] + "\nGender : " + data[i][1] + "\n");
        }

    }
}
