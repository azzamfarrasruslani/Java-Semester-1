package praktikum7;

import javax.swing.JOptionPane;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class latihan1 {

    public static void main(String[] args) {
        int pilihan, hargaSatuan = 0, bayarUang, kembalian, banyak, totalHarga;
        String nama, menu = null;

        nama = JOptionPane.showInputDialog("Masukan Nama Pembeli");
        pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Menu" + "\n1 = Nasi Goreng" + "\n2 = Ayam Bakar dan Nasi" + "\n3 = Ayam Goreng dan Nasi"));
        bayarUang = Integer.parseInt(JOptionPane.showInputDialog("Masukan Uang yang dibayar"));
        banyak = Integer.parseInt(JOptionPane.showInputDialog("Masukan banyak porsi"));

        switch (pilihan) {
            case 1:
                menu = "Pesanan Nasi Goreng";
                hargaSatuan = 10000;
                break;
            case 2:
                menu = "Pesanan Ayam Bakar dan Nasi";
                hargaSatuan = 15000;
                break;
            case 3:
                menu = "Pesanan Ayam Goreng dan Nasi";
                hargaSatuan = 17000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan Menu Tidak Tersedia");
                break;
        }
        totalHarga = banyak * hargaSatuan;
        kembalian = bayarUang - totalHarga;
        JOptionPane.showMessageDialog(null, "Nama Pembeli: " + nama + "\n" + "Pilihan: " + menu + "\n" + "Harga Satuan: Rp." + hargaSatuan + "\n" + "Banyak Porsi: " + banyak + "\n" + "Bayar: Rp." + bayarUang + "\n" + "Kembalian: Rp." + kembalian);

    }
}
