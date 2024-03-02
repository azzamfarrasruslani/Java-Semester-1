package pratikum6_inputOutputJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author  Azzam Farras Ruslani, 1 TI F
 */
public class contohBufferedReader {

    public static void main(String[] args) {
        int umur = 0;
        String data;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Inputkan umur : ");
            data = input.readLine();
            umur = Integer.parseInt(data);
        } catch (IOException ex) {
            System.out.println("Error : " + ex);

        }
        System.out.println("Umur saya adalah : " + umur);
    }
}
