package Pertemuan14;

//@author AZZAM FARRAS RUSLANI
public class PerbaikanPC1 {

    public static void main(String[] args) {
        int a [] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}
