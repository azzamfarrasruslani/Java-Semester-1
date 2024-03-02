package praktikum7;

import javax.swing.JOptionPane;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan1 {
    public static void main(String[] args) {
        int bil1;
        int bil2;
        
        bil1 = Integer.parseInt(JOptionPane.showInputDialog("inputkan bilangan 1"));
        bil2 = Integer.parseInt(JOptionPane.showInputDialog("inputkan bilangan 2"));
        
        if (bil1>bil2) {
            System.out.println("bilangan 1 lebih besar dari bilangan 2");
        }
        
    }
}
