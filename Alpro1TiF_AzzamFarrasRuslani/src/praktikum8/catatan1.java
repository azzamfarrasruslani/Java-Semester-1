


package praktikum8;
import javax.swing.JOptionPane;
/**
 *
 * @author 225 - PC 04
 */
public class catatan1 {

    public static void main(String[] args) {
        String nama, bertanya;

        do {
            nama = JOptionPane.showInputDialog("Masukan nama siswa");
            System.out.println(nama);
            bertanya = JOptionPane.showInputDialog("Apakah ingin mengulang ?");
        } while (bertanya.equalsIgnoreCase("ya"));
    
    }
}
