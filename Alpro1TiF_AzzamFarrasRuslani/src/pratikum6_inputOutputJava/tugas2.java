package pratikum6_inputOutputJava;

import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas2 {

    public static void main(String[] args) {
        String nama;
        int umur, tahunLahir, tahunSekarang;

        // Input nama 
        Scanner inputNama = new Scanner(System.in);
        System.out.println("Masukan Nama Anda : ");
        nama = inputNama.nextLine();

        //menedapatkan tahun sekarang
        Calendar cal = Calendar.getInstance();
        tahunSekarang = cal.get (Calendar.YEAR);
        
        // input tahunLahir
        Scanner inputTahunLahir = new Scanner (System.in);
        System.out.println("Masukan Tahun Lahir");
        tahunLahir = inputTahunLahir.nextInt();
        
        //proses mencari umur 
        umur = tahunSekarang - tahunLahir;
        
        // Output 
        System.out.println("Nama         : " + nama);
        System.out.println("Tahun Lahir  : " + tahunLahir);
        System.out.println("Umur Saya    : " + umur);
        
    }
}
