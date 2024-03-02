package alpro1tif_azzamfarrasruslani;

/**
 *
 * @author AZZAM FARRAS RUSLANI,1TIF
 */
public class Tugas2 {

    public static void main(String[] args) {
        int tinggi = 5; // Ubah nilai tinggi sesuai kebutuhan

        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi sebelum bintang
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Pindah ke baris baru setelah satu baris selesai
            System.out.println();
        }

    }
}
                              