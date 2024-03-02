package Pertemuan14;

//@author AZZAM FARRAS RUSLANI
public class PerbaikanPC6 {

    static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan
    }
    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}
