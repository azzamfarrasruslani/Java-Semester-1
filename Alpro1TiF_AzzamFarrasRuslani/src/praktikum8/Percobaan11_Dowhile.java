package praktikum8;

import javax.swing.JOptionPane;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Percobaan11_Dowhile {

    public static void main(String[] args) {
        String kata;

        do {
            kata = JOptionPane.showInputDialog("Masukan sebuah kata: ");
            JOptionPane.showMessageDialog(null, "Kata yang anda masukan: " + kata);
        } while (!kata.equals("Stop"));
    }
}
