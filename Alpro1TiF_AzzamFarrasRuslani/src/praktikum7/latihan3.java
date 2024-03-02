package praktikum7;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class latihan3 {

    public static void main(String[] args) {
        String namaBuah = null, kodeBuah;
        int berapaKilo, hargaSekilo, potHarga = 0, totalHarga;

        kodeBuah = JOptionPane.showInputDialog("Masukan Kode Buah" + "\nA = Apel" + "\nJ = Jeruk" + "\nM = Manggis");
        berapaKilo = Integer.parseInt(JOptionPane.showInputDialog("Berapa Kilo ?"));
        switch (kodeBuah) {
            case "A":
                namaBuah = "apel";
                hargaSekilo = 30000;
                potHarga = (int) (hargaSekilo - (hargaSekilo * 0.1));
                break;
            case "J":
                namaBuah = "jeruk";
                hargaSekilo = 25000;
                potHarga = (int) (hargaSekilo - (hargaSekilo * 0.15));
                break;
            case "M":
                namaBuah = "manggis";
                hargaSekilo = 35000;
                potHarga = (int) (hargaSekilo - (hargaSekilo * 0.2));
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Nama buah tidak terdaftar");
                break;
        }

        totalHarga = potHarga * berapaKilo;
        JOptionPane.showMessageDialog(null, "Nama buah : " + namaBuah + "\n" + "Banyak yang di beli : " + berapaKilo + "Kg" + "\n" + "Total harga : " + totalHarga);

    }

}
