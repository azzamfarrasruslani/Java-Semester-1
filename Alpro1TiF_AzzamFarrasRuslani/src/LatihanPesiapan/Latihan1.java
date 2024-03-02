package LatihanPesiapan;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan1 {

    public static void main(String[] args) {

        String[][] pertanyaan = {{"Siapa Yang Paling Ganteng dimuka Bumi ini ?", "A.Azzam", "B.Farras", "B", ""},
        {"Siapa Presiden Pertama Indo ?", "A.Soekarno", "B.Udin", "A"}};
        String[][] jwb = new String[pertanyaan.length][1];

        String nama = JOptionPane.showInputDialog("Masukan Nama");
        String kelas = JOptionPane.showInputDialog("Masukan Kelas");
        String nim = JOptionPane.showInputDialog("Masukan Nim");
        String matkul = JOptionPane.showInputDialog("Masukan Matkul");
        int poin = 0;
        int bobot = 0;

        for (int i = 0; i < jwb.length; i++) {

            jwb[i][0] = JOptionPane.showInputDialog(pertanyaan[i][0] + "\n" + pertanyaan[i][1] + "\n" + pertanyaan[i][2]);

        }

        for (int i = 0; i < jwb.length; i++) {

            if (jwb[i][0].equalsIgnoreCase(pertanyaan[i][3])) {
                poin += 50;
                bobot = 50;
                pertanyaan[i][3] = "Benar";

            } else {
                pertanyaan[i][3] = "Salah";
            }
        }

        System.out.print("Nama :" + nama + "\n");
        System.out.print("Kelas :" + kelas + "\n");
        System.out.print("Nim :" + nim + "\n");
        System.out.print("Matkula :" + matkul + "\n");
        System.out.print("Poin :" + poin + "\n");
        System.out.println("==============================="
                + "=================================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", 
                "No", "Jawaban", "Kunci Jwb", "Poin", "Ketetangan");
        System.out.println("=============================="
                + "==================================================================");

        for (int i = 0; i < jwb.length; i++) {

            System.out.printf("%-15s %-15s %-15s %-15s %-15s \n", (i + 1), jwb[i][0], pertanyaan[i][2], bobot, pertanyaan[i][3]);

        }

    }
}
