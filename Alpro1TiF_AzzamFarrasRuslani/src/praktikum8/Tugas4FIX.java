package praktikum8;
import javax.swing.JOptionPane;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas4FIX {
    public static void main(String[] args) {
        String input , jawab = "ya",nama;
        int usia;
        
        input = JOptionPane.showInputDialog("ya/tidk");
        while (input.equalsIgnoreCase(jawab)) {
           nama = JOptionPane.showInputDialog("Masukan nama");
           usia = Integer.parseInt(JOptionPane.showInputDialog("Masukan Usia")) ;
                   if ( usia >= 1 && usia <= 3 ) {
                       System.out.println("balita");
                       
                   } else if (usia >= 4 && usia <= 8){
                        System.out.println("bocil ");
                   } else if (usia >= 9 && usia <=16) {
                       System.out.println("remaja");
                   } else {
                       System.out.println("dewasa");
                   }
                           input = JOptionPane.showInputDialog("ya/tidk");
        }                    
    }
}
