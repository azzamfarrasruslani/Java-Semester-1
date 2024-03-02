package LatihanUAS;

import javax.swing.JOptionPane;


public class Latihan9 {

    public static void main(String[] args) {
        String[][] dataTlp = {
            {"Anton", "08131"},
            {"Wilson", "08132"},
            {"Lucy", "08133"},
            {"Cherry", "08134"},
            {"Nana", "08135"},
            {"Jack", "08136"},
            {"Toni", "08137"}};
        String inputNo;
        String noBaru, nama;
        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Menu"
                + "\n1.Ganti Nomor"
                + "\n2.Telepon Nomor"
                + "\n3.Daftar Kontak"
                + "\n4.Keluar"));
        while (pilihan == 1 || pilihan == 2 || pilihan == 3) {
            switch (pilihan) {
                case 1:

                    nama = JOptionPane.showInputDialog("Masukan Nama Kontak Yang dingin di Ubah");
                    for (int i = 0; i < dataTlp.length; i++) {
                        if (nama.equalsIgnoreCase(dataTlp[i][0])) {
                            noBaru = JOptionPane.showInputDialog("Masukan No Baru");
                            dataTlp[i][1] = noBaru;
                        }else {
                            JOptionPane.showMessageDialog(null, "Nama Tidak Tersedia Pada Kontak");
                            System.exit(0);
                        }
                    }
                    break;
                case 2:
                    inputNo = JOptionPane.showInputDialog("Masukan No Tujuan");
                    if (inputNo.equals(dataTlp[0][1])) {
                        JOptionPane.showMessageDialog(null, "Maaf No telp 08131 sudah tidak aktif lagi");
                    } else if (inputNo.equals(dataTlp[5][1]) && inputNo.equals("08136")) {
                        JOptionPane.showMessageDialog(null, "Maaf Nomor telah diganti coba untuk memasukan no baru");
                    }
                    break;

                case 3:
                    System.out.println("==================================");
                    System.out.printf("|%-15s| %-15s|\n", "Nama", "No HP");
                    System.out.println("==================================");
                    for (int i = 0; i < dataTlp.length; i++) {
                        System.out.printf("|%-15s| %-15s|\n", dataTlp[i][0], dataTlp[i][1]);
                    }
                    System.out.println("==================================");
                    break;

            }
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Pilihan Menu"
                    + "\n1.Ganti Nomor"
                    + "\n2.Telepon Nomor"
                    + "\n3.Daftar Kontak"
                    + "\n4.Keluar"));
        }
    }
}
