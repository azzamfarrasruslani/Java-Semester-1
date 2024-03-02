package praktikum8;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Tugas2FIX {

    public static void main(String[] args) {
        int coba = 0, maxCoba = 3, pilihMenu, saldoAwal = 3000000, tarikTunai, nominal;
        String pin, pinBenar = "123456";

        while (coba < maxCoba) {
            pin = JOptionPane.showInputDialog("-----Masukan Pin ATM Anda-----");
            if (pin.equals(pinBenar)) {

                pilihMenu = Integer.parseInt(JOptionPane.showInputDialog("-----Pilihan Menu----- "
                        + "\n1. Tarik Tunai \n2. Cek Saldo \n(1/2)"));
                switch (pilihMenu) {
                    case 1:
                        nominal = Integer.parseInt(JOptionPane.showInputDialog("-----Masukan Nominal Uang Yang Akan Di Tarik-----"));
                        tarikTunai = saldoAwal - nominal;
                        JOptionPane.showMessageDialog(null, "Uang Yang Anda Tarik Rp. " + nominal
                                + "\nSisa Saldo Anda Rp. " + tarikTunai);
                        System.exit(coba);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saldo Anda Miliki Rp. " + saldoAwal);
                        System.exit(coba);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Menu yang anda masukan salah, Coba lagi");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pin Yang Anda Masukan Salah, Input Ulang Pin Anda");
                coba++;
            }
        }
        JOptionPane.showMessageDialog(null, "Anda Telah Mencapai limit");
    }
}
