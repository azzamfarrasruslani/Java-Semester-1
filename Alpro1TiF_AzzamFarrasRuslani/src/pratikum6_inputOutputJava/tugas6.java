package pratikum6_inputOutputJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas6 {

    public static void main(String[] args) {
        String nama = null, dataTahun;
        int tahunLahir = 0, umur, tahunSekarang;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Inputan Nama 
        try {
            System.out.println("Masukan Nama Anda");
            nama = input.readLine();
        } catch (IOException ex) {
            System.out.println("Error" + ex);
        }
        // Inputan tahunLahir
        try {
            System.out.println("Masukan Tahun Lahir Anda");
            dataTahun = input.readLine();
            tahunLahir = Integer.parseInt(dataTahun);
        } catch (IOException ex) {
            System.out.println("Error" + ex);
        }
        //menedapatkan tahun sekarang
        Calendar cal = Calendar.getInstance();
        tahunSekarang = cal.get(Calendar.YEAR);

        //proses mencari umur 
        umur = tahunSekarang - tahunLahir;

        //Output
        System.out.println("Nama        : " + nama + "\n" + "Tahun Lahir : " + tahunLahir
                + "\n" + "Umur Saya   : " + umur);

    }
}
