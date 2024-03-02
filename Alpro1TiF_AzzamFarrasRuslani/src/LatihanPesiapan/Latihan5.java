package LatihanPesiapan;
import javax.swing.JOptionPane;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan5 {

    public static void main(String[] args) {
        String hariX[] = {"Senin", "Selasa", "Rabu"};
        String pengantarX[] = {"Bp.Rizal", "Bp. Ikhsan", "Bp Daniel"};
        double diskonX[] = {0.07, 0, 0.04};

        String hari, pengantar, pemesan, alamat;
        int jumlahBak, jumAir, totalAir = 0, totalHarga, biayaAntar;
        double diskon = 0;
        hari = JOptionPane.showInputDialog("Masukkan hari pengantaran air");
        for (int i = 0; i < diskonX.length; i++) {
            if (hari.equalsIgnoreCase(hariX[i])) {
                pengantar = pengantarX[i];
                diskon = diskonX[i];
                break;
            }
        }
        pemesan = JOptionPane.showInputDialog("masukkan nama pemesan");
        alamat = JOptionPane.showInputDialog("masukkan alamat pemesan");
        jumlahBak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah bak yang dipesan"));
        for (int i = 1; i <= jumlahBak; i++) {
            jumAir = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah air bak ke " + i));
            totalAir += jumAir;
        }
        totalHarga = totalAir * 3500; //total sebelum di diskon;
        totalHarga -= (totalHarga * diskon); //total sudah dikurangi diskon

        if (totalAir < 20) {
            biayaAntar = 10000;
        } else if (totalAir >= 20 && totalAir <= 30) {
            biayaAntar = 7000;
        } else {
            biayaAntar = 5000;
        }

        totalHarga += biayaAntar;
        System.out.println("Total harga Rp. " + totalHarga);
    }
}

