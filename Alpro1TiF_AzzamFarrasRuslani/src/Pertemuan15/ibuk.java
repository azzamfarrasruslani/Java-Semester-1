package Pertemuan15;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class ibuk {

     public static void main(String[] args) {

        String akun[][] = {{"alex", "123"}, {"audrey", "123"}};
        String limaPuluh[][] = {{"LP110", "Pak joni"}, {"LP113", null}, {"LP115", "Bu Nani"}, {"LP117", "pak Joko"}, {"LP119", "Bu Dodi"}};
        String bukitRaya[][] = {{"BP293", "Pak jojo"}, {"BP345", "Pak tono"}, {"BP777", null}, {"BP110", "pak Koko"}, {"BP432", "Pak Didi"}};
        String rumbai[][] = {{"RB909", null}, {"RB777", "Pak Nikolas"}, {"RB234", "Pak Key"}, {"RB787", "pak Kiko"}, {"RB311", null}};

        //program LOGIN 
        int ulangLogin = 1;
        while (ulangLogin <= 3) {
            String uname = JOptionPane.showInputDialog("Masukkan Username");
            String pass = JOptionPane.showInputDialog("Masukkan Password");
            try {
                for (int a = 0; a < akun.length; a++) {
                    if (uname.equalsIgnoreCase(akun[a][0]) && pass.equals(akun[a][1])) {
                        JOptionPane.showMessageDialog(null, uname + "BERHASIL LOGIN");
                        int menu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Menu:"
                                + "\n1. Deteksi Null Kel Lima Puluh"
                                + "\n2. Deteksi Null kel Bukit Raya"
                                + "\n3. Deteksi Null Kel Rumbai"
                                + "\n4. Tampil Data kelurahan"
                                + "\n5. Detele Data Salah Satu Kelurahan"));
                        while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5) {
                            switch (menu) {
                                case 1://Program Deteksi Null Array Lima Puluh
                                    for (int i = 0; i < limaPuluh.length; i++) {
                                        for (int j = 0; j < limaPuluh[i].length; j++) {
                                            try {
                                                if (limaPuluh[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) {
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah " + limaPuluh[i][0] + " SIlahkan didaftarkan");
                                                limaPuluh[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + limaPuluh[i][0]);
                                            }
                                        }
                                    }
                                    break;
                                case 2://Program Deteksi Null Array Bukit Raya
                                    for (int i = 0; i < bukitRaya.length; i++) {
                                        for (int j = 0; j < bukitRaya[i].length; j++) {
                                            try {
                                                if (bukitRaya[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) {
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah " + bukitRaya[i][0] + " SIlahkan didaftarkan");
                                                bukitRaya[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + bukitRaya[i][0]);
                                            }
                                        }
                                    }
                                    break;
                                case 3://Program Deteksi Null Array Rumbai
                                    for (int i = 0; i < rumbai.length; i++) {
                                        for (int j = 0; j < rumbai[i].length; j++) {
                                            try {
                                                if (rumbai[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) {
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah " + rumbai[i][0] + " SIlahkan didaftarkan");
                                                rumbai[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + rumbai[i][0]);
                                            }
                                        }
                                    }
                                    break;
                                case 4://Program Tampil Data
                                    System.out.println("\n\nDATA KELURAHAN ");
                                    System.out.println("Kelurahan Lima Pulih ");
                                    System.out.println(Arrays.deepToString(limaPuluh));
                                    System.out.println("Kelurahan Bukit Raya");
                                    System.out.println(Arrays.deepToString(bukitRaya));
                                    System.out.println("Keluragan Rumbai");
                                    System.out.println(Arrays.deepToString(rumbai));
                                    break;
                                case 5: //program Delete
                                    //Input pilih mau delete kelurahan mana
                                    //masukkan data yang ingin di delete
                                    // jika sesuai maka 1 baris record data TERHAPUS

                                    break;
                                default:
                                    System.exit(0);
                                    break;

                            }

                            menu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Menu LAGI:"
                                    + "\n1. Deteksi Null Kel Lima Puluh"
                                    + "\n2. Deteksi Null kel Bukit Raya"
                                    + "\n3. Deteksi Null Kel Rumbai"
                                    + "\n4. Tampil Data kelurahan"
                                    + "\n5. Detele Data Salah Satu Kelurahan"));
                        }

                        System.exit(0);//keluar program
                    } else {
                        throw new Exception();
                    }
                }
            } catch (Exception obj) {
                if (ulangLogin == 3) {
                    System.exit(0); //program berhenti
                } else {
                    ulangLogin++;
                    JOptionPane.showMessageDialog(null, obj + "\nERROR! Anda  akan mengulang ke " + ulangLogin + " kali");
                }
            }
        }

    }
}
