package pratikum6_inputOutputJava;

/**
 *
 * @author  Azzam Farras Ruslani 1 TI F
 */
public class contoh2 {

    public static void main(String[] args) {

        // code nya taruh disini
        int varInt = 45;
        float varFloat = 6.97f;
        double varDouble = 7.98845;

        char varChar = 'X';
        String varString = "Ini Sebuah String";

        System.out.printf("%d\n", varInt);
        System.out.printf("%e\n", varDouble);
        System.out.printf("%c\n", 9875);
        System.out.printf("%.3s\n", varString);

        System.out.format("%s\n", varString);

        System.out.println();

        // mencetak isi variabel melalui println harus menggunakan + (string concate)
        // setelah string yang telah ditutup.
        System.out.println("Ini adalah string yang dicetak dari println: " + varString);
    }
}
