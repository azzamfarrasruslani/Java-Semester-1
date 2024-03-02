package praktikum8;

import javax.swing.JOptionPane;

/**
 *
 * @author Azzam Farras Ruslani
 */
public class Percobaan12_Dowhile2 {

    public static void main(String[] args) {
        String kata;
        int pilihan;
        Double number1, number2, jumlah, kurang, kali, bagi;

        kata = "ya";

        do {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog(null, "Inputkan 1 jika ingin menjumlahkan\n"
                    + "Inputkan 2 jika ingin mengurangi\n"
                    + "Inputkan 3 jika ingin mengalikan\n"
                    + "Inputkan 4 jika ingin membagi"));

            switch (pilihan) {
                case 1:
                    number1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka pertama"));
                    number2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka kedua"));

                    jumlah = number1 + number2;
                    JOptionPane.showMessageDialog(null, "Hasil Penjumlahan: " + jumlah);
                    break;
                case 2:
                    number1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka pertama"));
                    number2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka kedua"));

                    kurang = number1 - number2;
                    JOptionPane.showMessageDialog(null, "Hasil Pengurangan: " + kurang);
                    break;
                case 3:
                    number1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka pertama"));
                    number2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka kedua"));

                    kali = number1 * number2;
                    JOptionPane.showMessageDialog(null, "Hasil Pengalian: " + kali);
                    break;
                case 4:
                    number1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka pertama"));
                    number2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan angka kedua"));

                    bagi = number1 / number2;
                    JOptionPane.showMessageDialog(null, "Hasil Pembagian: " + bagi);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Maaf, masukan anda salah...");
            }
            kata = JOptionPane.showInputDialog("Anda ingin menggunakan program lagi (Ya/Tidak) ?");
        } while (kata.equals("Ya") || kata.equals("ya"));
    }
}
