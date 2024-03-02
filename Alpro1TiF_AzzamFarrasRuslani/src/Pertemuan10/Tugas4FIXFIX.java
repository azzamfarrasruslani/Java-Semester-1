package Pertemuan10;

import javax.swing.JOptionPane;
//@author AZZAM FARRAS RUSLANI//
public class Tugas4FIXFIX {

    public static void main(String[] args) {
        String ulang;
        int tampung = 1;
        int maxData = 100;
        String[][] dataPengunjung = new String[maxData][3];
        JOptionPane.showMessageDialog(null, "Data Pengunjung Hotel Grand Prize");

        for (int i = 0; i < maxData; i++) {
            System.out.println("Data Pengunjung Ke-" + tampung);
            dataPengunjung[i][0] = JOptionPane.showInputDialog("Masukan Nama Pengujung ke- " + tampung);
            System.out.println("Nama Pengunjung : " + dataPengunjung[i][0]);
            dataPengunjung[i][1] = JOptionPane.showInputDialog("Tujuan Menginap");
            System.out.println("Tujuan Menginap : " + dataPengunjung[i][1]);
            dataPengunjung[i][2] = JOptionPane.showInputDialog("Asal Pengunjung");
            System.out.println("Asal Pengunjung : " + dataPengunjung[i][2]);
            System.out.println("\n");

            tampung++;

            if (tampung > maxData) {
                System.out.println("Anda Telah Mencapai Limit Untuk Memasukan Data\n\n");
                System.out.println("------------------------------------------------------------");
                System.out.println("Data Pengujung Hotel Grand Prize");
                System.out.println("------------------------------------------------------------");
                System.out.printf("%-15s %-15s  %-15s  %-20s \n", "NO",
                        "Nama", "Tujuan", "Asal");
                for (int j = 0; j < tampung - 1; j++) {
                      System.out.printf("%-15s %-15s  %-15s  %-20s \n",
                              (j + 1), dataPengunjung[j][0], dataPengunjung[j][1], dataPengunjung[j][2]);
                }
                break;
            }

            ulang = JOptionPane.showInputDialog("Apakah anda ingin menginput data lagi");

            if (!ulang.equalsIgnoreCase("ya")) {
                System.out.println("--------------------------------------"
                        + "----------------------");
                System.out.println("Data Pengujung Hotel Grand Prize");
                System.out.println("-------------------------------------"
                        + "-----------------------");
                 System.out.printf("%-15s %-15s  %-15s  %-20s \n", 
                         "NO", "Nama", "Tujuan", "Asal");
                for (int j = 0; j < tampung - 1; j++) {
                     System.out.printf("%-15s %-15s  %-15s  %-20s \n", 
                             (j + 1), dataPengunjung[j][0], dataPengunjung[j][1], dataPengunjung[j][2]);
                }
                break;
            }
        }
    }
}
