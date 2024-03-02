package Pertemuan14;

//@author AZZAM FARRAS RUSLANI
public class PerbaikanPC3_Bg1 {

    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil / 0);
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
