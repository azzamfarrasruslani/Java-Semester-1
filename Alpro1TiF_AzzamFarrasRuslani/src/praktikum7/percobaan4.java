package praktikum7;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan4 {

    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
          System.out.println(" Please Enter you Age");
          age = sc.nextInt();
          
          if (age < 18 ) {
              System.out.println("You are Minor");
              System.out.println("You are Not Eligible to Work");
          }
          else {
              if (age >= 18 && age <= 60) {
                  System.out.println("You are Eligible to work");
                  System.out.println("Please fill in your details and apply");
              }
              else {
                  System.out.println("You are old to work as per the Goverment rules");
                  System.out.println("Please Collect your pension");
              }
          }
                System.out.println("\nThis Message is coming from Outside the IF ELSE STATEMENT");

    }
}
