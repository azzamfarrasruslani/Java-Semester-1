package LatihanUAS;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan3 {

    public static void main(String[] args) {
        int jmlReg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Data"));
        String regis[][] = new String[jmlReg][6];
        int pilihan1 = Integer.parseInt(JOptionPane.showInputDialog("Data Pengunjung Hotel Bahagia \nSilahkan Memilih Menu"
                + "\n1.Registrasi Akun"
                + "\n2.Cek Data Registrasi"
                + "\n3.Login"
                + "\n4.Keluar"));
        while (pilihan1 == 1 || pilihan1 == 2) {
            if (pilihan1 == 1) {

                for (int i = 0; i < regis.length; i++) {
                    regis[i][0] = JOptionPane.showInputDialog("Masukan Nama");
                    regis[i][1] = JOptionPane.showInputDialog("Masukan Umur Dari " + regis[i][0]);
                    regis[i][2] = JOptionPane.showInputDialog("Masukan Jenis Kelamin Dari " + regis[i][0]);
                    regis[i][3] = JOptionPane.showInputDialog("Masukan Alamat Dari " + regis[i][0]);
                    regis[i][4] = JOptionPane.showInputDialog("Masukan Nomor HP Dari " + regis[i][0]);
                    try {
                        regis[i][5] = JOptionPane.showInputDialog("Masukan Pin Kamar untuk  " + regis[i][0]);
                        if (regis[i][5].length() > 5) {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Masukan Pin Lagi\n[Pin Tidak Boleh lebih Dari 5 karakter]");
                        regis[i][5] = JOptionPane.showInputDialog("Masukan Ulang Pin Kamar untuk  " + regis[i][0]);
                    }
                }
            } else if (pilihan1 == 2) {
                System.out.println("Data Registrasi Pengunjung Hotel");
                System.out.println("===================================================================================="
                        + "=========================================");
                System.out.printf("|%-15s| |%-15s| |%-15s| |%-15s| |%-15s| |%-15s| |%-15s|\n", "No", "Nama", "Umur", "Gender", "Alamat", "NO HP", "Pin Kamar");
                System.out.println("===================================================================================="
                        + "=========================================");
                for (int i = 0; i < regis.length; i++) {
                    System.out.printf("|%-15s| |%-15s| |%-15s| |%-15s| |%-15s| |%-15s| |%-15s|\n", (i + 1), regis[i][0], regis[i][1], regis[i][2], regis[i][3], regis[i][4], regis[i][5]);

                }
            } else if (pilihan1 == 3) {
                int pilihan2 = Integer.parseInt(JOptionPane.showInputDialog("Menu Login Pengunjung Hotel Bahagia \nSilahkan Memilih Menu"));
                
                
            } 
            pilihan1 = Integer.parseInt(JOptionPane.showInputDialog("Data Pengunjung Hotel Bahagia \nSilahkan Memilih Menu"
                    + "\n1.Registrasi Akun"
                    + "\n2.Cek Data Registrasi"
                    + "\n3.Login"
                    + "\n4.Keluar"));
        }
    }

}
