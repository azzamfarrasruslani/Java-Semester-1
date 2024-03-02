package praktikum7;

import java.util.Scanner;

/**
 *
 * @author Azzam Farras Ruslani, 1 TI F
 */
public class percobaan3 {
    public static void main(String[] args) {
        String jurusan;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Silahkan inputkan jurusan");
        jurusan=input.nextLine();
        if (jurusan.equals("TI")){
             System.out.println("Selamat datang Mahasiswa Teknik Informatika");
        } else if (jurusan.equals("SI")){
            System.out.println("Selamat datang Mahasiswa Sistem Informasi");
        } else if (jurusan.equals("TK")) {
            System.out.println("Selamat datang Mahasiswa Teknik Komputer");
        } else if (jurusan.equals("TL")) {
            System.out.println("Selamat datang Mahasiswa Teknik Listrik");
        } else {
            System.out.println("Tidak ada pilihan jurusan");
        }
        
    }
}

//perbedaan method equals dengan method equalsIgnoreCase, kalau kita menggunkaan 
//metode equals maka inputan kita harus mirip dengan perbandingan yang telah kita buat hal itu disebut case sensitif tetapi,
//jika menggunakan metode equalsIgnoreCase maka tidak case sensitif dan inputan boleh beda dengan perbandingan
