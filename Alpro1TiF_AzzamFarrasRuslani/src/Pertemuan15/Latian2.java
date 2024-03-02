package Pertemuan15;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author 225 - PC 06
 */
public class Latian2 {

    public static void main(String[] args) {
        String kecLP[][] = {
            {"LP110", "Bp Budi"},
            {"LP113", null},
            {"LP115", "Bp Faisal"},
            {"LP117", "Bp Isan"},
            {"LP119", "Bp Dani"}};

        String kecBR[][] = {
            {"BP293", "Bp Leo"},
            {"BP35", "Bp Adam"},
            {"BP777", null},
            {"BP110", "Bu Sinta"},
            {"BP432", "Bu Salma"}};

        String kecRB[][] = {
            {"RB909", null},
            {"RB777", "Bp Dika"},
            {"RB234", "Bp Dono"},
            {"RB787", "Bp Indro"},
            {"RB311", null}};
        System.out.println("Data Sebelum Di Update");
        System.out.println(Arrays.deepToString(kecLP));
        System.out.println(Arrays.deepToString(kecBR));
        System.out.println(Arrays.deepToString(kecRB));
        int max = 3;
        int i = 0;
        String akun[][] = {
            {"alex", "1234"},
            {"audrey", "1234"}};
        try {
            do {
                String userName = JOptionPane.showInputDialog("Masukan User Name");
                String pass = JOptionPane.showInputDialog("Masukan Password");
                for (int j = 1; j < akun.length; j++) {
                    
//                    if (akun[i][1].equals(pass) && akun[i][0].equalsIgnoreCase(userName)) {
//                        System.out.println("pss benar");
//                        System.exit(0);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Pin dan User Name yang anda masukan salah, silahkan coba lagi percobaan ke- " + i);
//                        i++;
//                    }
                    System.out.println("Username : " + akun[i][0]);
                    System.out.println("Username : " + akun[i][0]);
                }
            } while (i <= 3);

        } catch (Exception er) {
            System.out.println("pass salah");
        }
        
//        for (int i = 0; i < kecLP.length; i++) {
//            for (int j = 0; j < kecLP[i].length; j++) {
//                try {
//                    if (kecLP[i][j] == null) {
//                        throw new Exception();
//                    }
//                } catch (Exception err) {
//                    JOptionPane.showMessageDialog(null, "Terdeteksi Nama Kk di Kec Lima Puluh belum terdaftar pada nomor " + kecLP[i][0]);
//                    kecLP[i][j] = JOptionPane.showInputDialog("Masukan Nama Kapala kepala keluarha pada nomor " + kecLP[i][0]);
//                }
//            }
//        }
//
//        for (int i = 0; i < kecBR.length; i++) {
//            for (int j = 0; j < kecBR[i].length; j++) {
//                try {
//                    if (kecBR[i][j] == null) {
//                        throw new Exception();
//                    }
//                } catch (Exception err) {
//                    JOptionPane.showMessageDialog(null, "Terdeteksi Nama Kk di Kec Lima Puluh belum terdaftar pada nomor " + kecBR[i][0]);
//                    kecBR[i][j] = JOptionPane.showInputDialog("Masukan Nama Kapala kepala keluarha pada nomor " + kecBR[i][0]);
//                }
//            }
//        }
//
//        for (int i = 0; i < kecRB.length; i++) {
//            for (int j = 0; j < kecRB[i].length; j++) {
//                try {
//                    if (kecRB[i][j] == null) {
//                        throw new Exception();
//                    }
//                } catch (Exception err) {
//                    JOptionPane.showMessageDialog(null, "Terdeteksi Nama Kk di Kec Lima Puluh belum terdaftar pada nomor " + kecRB[i][0]);
//                    kecRB[i][j] = JOptionPane.showInputDialog("Masukan Nama Kapala kepala keluarha pada nomor " + kecRB[i][0]);
//                }
//            }
//        }
//
//        System.out.println("Data Setelah Di Update");
//        System.out.println(Arrays.deepToString(kecLP));
//        System.out.println(Arrays.deepToString(kecBR));
//        System.out.println(Arrays.deepToString(kecRB));

//        kecLP[1][1] = "Pak Anto";
//        kecBR[2][1] = "Bu Yasmin";
//        kecRB[4][1] = "Pak Jami";
//        kecRB[0][1] = "Pak Udin";

    }

}
