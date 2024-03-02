package LatihanUAS_Teori;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan9 {

    public static void main(String[] args) {

        int bil1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan pengali"));
        int bil2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan bilangan yang dikali"));
        int tampBil = 0;

        System.out.print("Hasil Perkalian "
                + bil1 + " x " + bil2 + " = ");
        for (int i = 0; i < bil1; i++) {    
                 System.out.print(bil2 + " + ");          
            tampBil += bil2;
        }
        System.out.print(" = " + tampBil);
    }
}
