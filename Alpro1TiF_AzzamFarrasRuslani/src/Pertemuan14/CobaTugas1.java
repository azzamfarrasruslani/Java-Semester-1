
package Pertemuan14;
import javax.swing.JOptionPane;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class CobaTugas1 {
     public static void main(String[] args) {
        int data = Integer.parseInt(
                JOptionPane.showInputDialog("Masukkan banyak data colon pendaftaran mahasiswa yang ingin didata"));
        String[][] dtMhs = new String[data][5];
        int jmlUmur = 0, perempuan = 0, laki = 0, ti = 0, si = 0, trk = 0;
        double rata = 0, nilaiRata = 0;
        String status[] = new String[data];
        String ulang = "ya", tampungCari = "", tampung2 = "";

        for (int i = 0; i < dtMhs.length; i++) {
            dtMhs[i][0] = JOptionPane.showInputDialog("Masukkan Nama Siswa ke-" + (i + 1));
            dtMhs[i][1] = JOptionPane.showInputDialog("Masukkan Umur Siswa " + dtMhs[i][0]);
            dtMhs[i][2] = JOptionPane.showInputDialog("Masukkan Gender Siswa " + dtMhs[i][0] + " [PR/LK]");
            dtMhs[i][3] = JOptionPane.showInputDialog("Masukkan Nilai rata-rata Raport Siswa " + dtMhs[i][0]);
            dtMhs[i][4] = JOptionPane.showInputDialog("Masukkan Minat Jurusan Siswa " + dtMhs[i][0] + " [TI/SI/TRK]");
            jmlUmur += Integer.parseInt(dtMhs[i][1]);
            nilaiRata = Double.parseDouble(dtMhs[i][3]);

            if (dtMhs[i][2].equalsIgnoreCase("PR")) {
                perempuan++;
            } else {
                laki++;
            }

            if (dtMhs[i][4].equalsIgnoreCase("TI")) {
                ti++;
                if (nilaiRata > 70) {
                    status[i] = "Lulus";
                } else {
                    status[i] = "Tidak Lulus";
                }

            } else if (dtMhs[i][4].equalsIgnoreCase("SI")) {
                si++;
                if (nilaiRata > 60) {
                    status[i] = "Lulus";
                } else {
                    status[i] = "Tidak Lulus";
                }
            } else {
                trk++;
                if (nilaiRata > 65) {
                    status[i] = "Lulus";
                } else {
                    status[i] = "Tidak Lulus";
                }
            }
            rata = jmlUmur / dtMhs.length;
        }

        System.out.println("Nama Siswa | Umur | Gender | Nilai Rata2 Raport | Minat Jurusan |Status");
        System.out.println("=========================================================================");
        for (int i = 0; i < dtMhs.length; i++) {
            for (int j = 0; j < dtMhs[i].length; j++) {
                if (j <= 2) {
                    System.out.print(dtMhs[i][j] + "\t   | ");
                } else if (j == 3) {
                    System.out.print(dtMhs[i][j] + "\t\t\t| ");
                } else {
                    System.out.print(dtMhs[i][j] + "\t\t| ");
                }
            }
            System.out.print(status[i]);
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("===============================MODIFIKASI==============================");
        System.out.print("Rata Rata umur siswa yang mendaftar adalah: " + rata + "\n");
        System.out.print("Pendaftar laki laki: " + laki + "\n");
        System.out.print("Pendaftar Perempuan: " + perempuan + "\n");
        System.out.println("Data jumlah orang minat jurusan --> \tTI: " + ti + "\tSI: " + si + "\tTRK: " + trk);
        System.out.println("================================MODIFIKASI PT2=====================================");

        do {
            String cariNama = JOptionPane.showInputDialog("Masukkan nama siswa yang data nya di cari!");
            for (int i = 0; i < dtMhs.length; i++) {
                if (dtMhs[i][0].equalsIgnoreCase(cariNama)) {
                    tampungCari += ((i + 1) + ". " + dtMhs[i][0] + "\n");
                    // tampungCari += ("Data cari ke-" + (i + 1)
                    // + "\nNama : " + dtMhs[i][0]
                    // + "\nUmur : " + dtMhs[i][1]
                    // + "\nGender : " + dtMhs[i][2]
                    // + "\nNilai Rata : " + dtMhs[i][3]
                    // + "\nMinat jurusan : " + dtMhs[i][4]
                    // + "\n\n");
                    // break;
                }
            }
            ulang = JOptionPane.showInputDialog("Apakah ingin mencari data siswa lagi? ");
        } while (ulang.equalsIgnoreCase("ya"));
        System.out.println("Data yang ditemukan dari program mencari data pasien adalah ");
        System.out.println(tampungCari);
    }
}
