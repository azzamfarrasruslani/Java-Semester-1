
package Pertemuan14;

//@author AZZAM FARRAS RUSLANI
public class perbaikanPC7 {
    public static void main(String[] args) {
        try {
            throw new Exception("Ini Exception saya");
        } catch (Exception e) {
            System.out.println("Exception Terdeteksi");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
        }
    }
}
