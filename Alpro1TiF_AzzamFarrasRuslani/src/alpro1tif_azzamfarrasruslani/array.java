package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author 225 - PC 06
 */
public class array {

    public static void main(String[] args) {
        int total = 0;
        int angka[] = null;

        int jmlDt = Integer.parseInt(JOptionPane.showInputDialog("Masukan jml angka"));
        angka = new int[jmlDt];

        for (int i = 1; i < jmlDt; i++) {
            angka[i] = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai angka"));
            total += angka[i];
        }

        for (int j = 1; j < angka.length; j++) {
            System.out.println("angka ke " + j + "adalah" + angka[j]);

        }

        System.out.println(total);

    }
}
