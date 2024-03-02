package LatihanUAS;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan2Coba {

    public static void main(String[] args) {
        String akun[][] = {
            {"user1", "123", "Azzam", "10000000"},
            {"user2", "123", "Farras", "1000000"}};
        int limitLogin = 3;
        boolean login = false;
        int ulangLogin = 1;
        int kesempatan = 2;

        while (ulangLogin <= limitLogin && !login) {
            try {
                String userName = JOptionPane.showInputDialog("Masukan Username");
                String pass = JOptionPane.showInputDialog("Masukan Pin");
                for (int i = 0; i < akun.length; i++) {
                    if (userName.equalsIgnoreCase(akun[i][0]) && pass.equals(akun[i][1])) {
                        JOptionPane.showMessageDialog(null, "Selamat Datang " + akun[i][2]);
                        login = true;
                        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Pilih Opsi"
                                + "\n1.Cek Saldo"
                                + "\n2.Transfer Uang"
                                + "\n3.Ubah Password"
                                + "\n4.Isi Saldo"
                                + "\n5.Keluar"));

                        int saldo = Integer.parseInt(akun[i][3]);
                        while (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4) {
                            switch (pilihan) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Saldo Anda\nRp. " + saldo);
                                    break;
                                case 2:
                                    int jmlTransfer = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nominal Transfer"));
                                    saldo -= jmlTransfer;
                                    break;
                                case 3:
                                    String ubahPass = JOptionPane.showInputDialog("Masukan Password Baru");
                                    akun[i][1] = ubahPass;
                                    break;
                                case 4:
                                    int topUp = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nominal Transfer"));
                                    saldo += topUp;
                                    break;
                            }
                            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Pilih Opsi"
                                    + "\n1.Cek Saldo"
                                    + "\n2.Transfer Uang"
                                    + "\n3.Ubah Password"
                                    + "\n4.Isi Saldo"
                                    + "\n5.Keluar"));
                        }
                        System.exit(0);
                    }
                }
                // Jika tidak ada akun yang cocok, lempar exception
                throw new Exception("Username atau password tidak valid");
            } catch (Exception a) {
                ulangLogin++;
                JOptionPane.showMessageDialog(null, "Pin atau Username yang anda masukan salah. Coba lagi");
                // Apabila kesempatan habis, keluar dari program
                if (ulangLogin > limitLogin) {
                    JOptionPane.showMessageDialog(null, "Anda melebihi batas percobaan login. Program berhenti.");
                    System.exit(0);
                }
            }
        }
    }
}
