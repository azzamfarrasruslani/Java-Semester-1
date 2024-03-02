package pratikum6_inputOutputJava;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas3 {

    public static void main(String[] args) {
        double panjang, lebar, kel, luas;

        //Meminta inputan panjang 
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukan Panjang"));
        //Meminta inputan lebar
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukan Lebar"));

        //Proses kel dan luas
        kel = 2 * (panjang + lebar);
        luas = panjang * lebar;

        //Output 
        JOptionPane.showMessageDialog(null, "Keliling persegi panjang adalah = " + kel + "\n"
                + "Luas persegi panjang adalah = " + luas);
    }
}
