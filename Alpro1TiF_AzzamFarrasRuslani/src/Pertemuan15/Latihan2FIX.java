package Pertemuan15;

import javax.swing.JOptionPane;
import java.util.Arrays;

//@author AZZAM FARRAS RUSLANI
public class Latihan2FIX {

    public static void main(String[] args) {

        String akun[][] = {{"alex", "123"}, {"audrey", "123"}}; // <=== Array 2D untuk menampung data akun yang telah terdaftar
        String limaPuluh[][] = {
            {"LP110", "Bp Budi"},
            {"LP113", null},
            {"LP115", "Bp Faisal"}, //<=== Array 2D untuk menampung data keluarga dari kelurahan lima puluh
            {"LP117", "Bp Isan"},
            {"LP119", "Bp Dani"}};

        String bukitRaya[][] = {
            {"BP293", "Bp Leo"},
            {"BP35", "Bp Adam"},
            {"BP777", null}, //<=== Array 2D untuk menampung data keluarga dari kelurahan bukit raya
            {"BP110", "Bu Sinta"},
            {"BP432", "Bu Salma"}};

        String rumbai[][] = {
            {"RB909", null},
            {"RB777", "Bp Dika"},
            {"RB234", "Bp Dono"}, //<=== Array 2D untuk menampung data keluarga dari kelurahan rumbai
            {"RB787", "Bp Indro"},
            {"RB311", null}};
        //program LOGIN <== Program akan mengulang meminta inputan username dan password jika terdapat kesalahan, dengan batas 3 jika melebihi batas dari itu maka program akan berhenti dan langsung selesai tanpa mengeksekusi kode yang dibawahnya
        int ulangLogin = 1;
        while (ulangLogin <= 3) {
            String uname = JOptionPane.showInputDialog("Masukkan Username");
            String pass = JOptionPane.showInputDialog("Masukkan Password");
            try {  // <== penggunaan block try yang digunakan untuk mengeksekusi program dan akan ditangkap oleh block catch jika perulangan login lebih dari 3
                for (int a = 0; a < akun.length; a++) {
                    if (uname.equalsIgnoreCase(akun[a][0]) && pass.equals(akun[a][1])) {
                        JOptionPane.showMessageDialog(null, "Akun " + uname + " BERHASIL LOGIN");
                        int menu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Menu:"
                                + "\n1. Deteksi Null Kel Lima Puluh"
                                + "\n2. Deteksi Null Kel Bukit Raya"
                                + "\n3. Deteksi Null Kel Rumbai" // <== pilihan menu untuk sebagai pilihan switch case
                                + "\n4. Tampil Data kelurahan"
                                + "\n5. Detele Data Salah Satu Kelurahan"
                                + "\n6. Keluar")); // <== menambahkan pilihan keluar untuk mempermudah
                        while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5) {  //<== penggunaan while looping yang akan 
                            switch (menu) {
                                case 1://Program Deteksi Null Array Lima Puluh
                                    for (int i = 0; i < limaPuluh.length; i++) {
                                        for (int j = 0; j < limaPuluh[i].length; j++) {
                                            try {    //<== mengecek apakah pada data ada terdapat null jika terdapa null maka akan ditangkap oleh catch
                                                if (limaPuluh[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) { //<== setelah di tangkap maka program akan meminta input data yang null untuk disi sebanya jumlah data null
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah " 
                                                        + limaPuluh[i][0] + " SIlahkan didaftarkan");
                                                limaPuluh[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + limaPuluh[i][0]);
                                            }
                                        }
                                    }                                  
                                    break;
                                case 2://Program Deteksi Null Array Bukit Raya
                                    for (int i = 0; i < bukitRaya.length; i++) {
                                        for (int j = 0; j < bukitRaya[i].length; j++) {
                                            try {   //<== mengecek apakah pada data ada terdapat null jika terdapa null maka akan ditangkap oleh catch
                                                if (bukitRaya[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) {  //<== setelah di tangkap maka program akan meminta input data yang null untuk disi sebanya jumlah data null
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah "
                                                        + bukitRaya[i][0] + " SIlahkan didaftarkan");
                                                bukitRaya[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + bukitRaya[i][0]);
                                            }
                                        }
                                    }                                   
                                    break;
                                case 3://Program Deteksi Null Array Rumbai
                                    for (int i = 0; i < rumbai.length; i++) {
                                        for (int j = 0; j < rumbai[i].length; j++) {
                                            try {   //<== mengecek apakah pada data ada terdapat null jika terdapa null maka akan ditangkap oleh catch
                                                if (rumbai[i][j] == null) {
                                                    throw new Exception();
                                                }
                                            } catch (Exception err) {  //<== setelah di tangkap maka program akan meminta input data yang null untuk disi sebanya jumlah data null
                                                JOptionPane.showMessageDialog(null, err + "\nTerdeteksi Nama KK di Kel Lima Puluh belum Terdaftar di nomor rumah " 
                                                        + rumbai[i][0] + " SIlahkan didaftarkan");
                                                rumbai[i][j] = JOptionPane.showInputDialog("Masuukkan Nama kepala keluarga pada nomor " + rumbai[i][0]);
                                            }
                                        }
                                    }                                   
                                    break;
                                case 4://Program Tampil Data
                                    System.out.println("\n\nDATA KELURAHAN ");
                                    System.out.println("Kelurahan Lima Pulih ");
                                    System.out.println(Arrays.deepToString(limaPuluh)); //<== menampilkan data array pada kel lima puluh
                                    System.out.println("Kelurahan Bukit Raya");
                                    System.out.println(Arrays.deepToString(bukitRaya));   //<== menampilkan data array pada kel bukit raya
                                    System.out.println("Keluragan Rumbai");
                                    System.out.println(Arrays.deepToString(rumbai));  //<== menampilkan data array pada kel rumbai
                                    break;
                                case 5: //program Delete //Input pilih mau delete kelurahan mana //masukkan data yang ingin di delete // jika sesuai maka 1 baris record data TERHAPUS
                                    int carikel = Integer.parseInt(JOptionPane.showInputDialog("Masukan Keluarahan dari data kk yang ingin dihapus"
                                            + "\n1.Kelurahan Lima Puluh"
                                            + "\n2.Kelurahan Bukit Raya"
                                            + "\n3.Kelurahan Rumbai"));
                                    String alamat;
                                    switch (carikel) {
                                        case 1: // untuk Menghapus data kelurahan lima puluh
                                            alamat = JOptionPane.showInputDialog("Masukan alamat keluarga yang ingin di hapus");
                                            for (int i = 0; i < limaPuluh.length; i++) {
                                                if (alamat.equals(limaPuluh[i][0])) {  // kondisi alamat sama dengan data array untuk alamat 
                                                    for (int j = 0; j < limaPuluh[i].length; j++) {
                                                        limaPuluh[i][j] = null;  // <==jika data input alamat cocok dengan data pada array maka dapat dihapus dengan di nullkan
                                                    }
                                                }
                                            }
                                            System.out.println("Data Setelah Di Hapus");
                                            System.out.println(Arrays.deepToString(limaPuluh));
                                            break;
                                        case 2: // untuk Menghapus data kelurahan bukit raya
                                            alamat = JOptionPane.showInputDialog("Masukan alamat keluarga yang ingin di hapus");
                                            for (int i = 0; i < bukitRaya.length; i++) {
                                                if (alamat.equals(bukitRaya[i][0])) {  // kondisi alamat sama dengan data array untuk alamat 
                                                    for (int j = 0; j < bukitRaya[i].length; j++) {
                                                        bukitRaya[i][j] = null;  // <==jika data input alamat cocok dengan data pada array maka dapat dihapus dengan di nullkan
                                                    }
                                                }
                                            }
                                            System.out.println("Data Setelah Di Hapus");
                                            System.out.println(Arrays.deepToString(bukitRaya));
                                            break;
                                        case 3:  // untuk Menghapus data kelurahan rumbai
                                            alamat = JOptionPane.showInputDialog("Masukan alamat keluarga yang ingin di hapus");
                                            for (int i = 0; i < rumbai.length; i++) {
                                                if (alamat.equals(rumbai[i][0])) {   // kondisi alamat sama dengan data array untuk alamat 
                                                    for (int j = 0; j < rumbai[i].length; j++) {
                                                        rumbai[i][j] = null;  // <==jika data input alamat cocok dengan data pada array maka dapat dihapus dengan di nullkan
                                                    }
                                                }
                                            }
                                            System.out.println("Data Setelah Di Hapus");
                                            System.out.println(Arrays.deepToString(rumbai));
                                            break;

                                    }
                                    break;
                                default:
                                    System.exit(0);
                                    break;

                            }
                            menu = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Menu LAGI:" //<== progaram akan menapilkan bagian ini terus sampai use inputkan pikihan menu swlain 1 2 3 4 5 atau memilih 6 utnuk keluar
                                    + "\n1. Deteksi Null Kel Lima Puluh"
                                    + "\n2. Deteksi Null kel Bukit Raya"
                                    + "\n3. Deteksi Null Kel Rumbai"
                                    + "\n4. Tampil Data kelurahan"
                                    + "\n5. Detele Data Salah Satu Kelurahan"
                                    + "\n6. Keluar"));
                        }

                        System.exit(0); //selain cara ini
//                        ulangLogin = 4; //<--- bisa juga digunakan dengan cara ini
                    } else {
                        throw new Exception();  //<== block throw akan melempar error ke block catch 
                    }
                }
            } catch (Exception obj) { //<===  block catch yang akan menangkap error dari throw 
                if (ulangLogin == 3) { //<== jika pada increment pada variabel ulangLogin sama dengan tiga maka program akan berhenti
                    System.exit(0); //program berhenti
                } else {
                    ulangLogin++;  // <== tetapi jika belum mencapai 3 maka variabel ulangLogin akan di increment
                    JOptionPane.showMessageDialog(null, obj + "\nERROR! Anda  akan mengulang ke " + ulangLogin + " kali"); //<== digunakan untuk menapilkan keterangan erro dan berapakali sudah mencoba memasukan user name dan password
                }
            }
        }
    }
}
