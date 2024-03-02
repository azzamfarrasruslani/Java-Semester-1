package praktikum7;

import java.util.Scanner;

/**
 *
 * @author  Azzam 
 */
public class pretest1 {

    public static void main(String[] args) {
        String nama, kelas, namaGuru;
        double rerata, nilaiTugas, nilaiUlangan, nilaiUjian;

        // input nama
        Scanner inputNama = new Scanner(System.in);
        System.out.println("Masukan nama : ");
        nama = inputNama.nextLine();

        // input kelas
        Scanner inputKelas = new Scanner(System.in);
        System.out.println("Masukan kelas : ");
        kelas = inputKelas.nextLine();

        // input nama guru
        Scanner inputNamaGuru = new Scanner(System.in);
        System.out.println("Masukan nama guru : ");
        namaGuru = inputKelas.nextLine();

        //meminta input nilai tugas
        Scanner inputNilaiTugas = new Scanner(System.in);
        System.out.println("Masukan nilai tugas= ");
        nilaiTugas = inputNilaiTugas.nextDouble();

        //meminta input nilai ulangan
        Scanner inputNilaiUlangan = new Scanner(System.in);
        System.out.println("Masukan nilai ulangan= ");
        nilaiUlangan = inputNilaiUlangan.nextDouble();

        //meminta input nilai ujian
        Scanner inputNilaiUjian = new Scanner(System.in);
        System.out.println("Masukan nilai ujian= ");
        nilaiUjian = inputNilaiUjian.nextDouble();

        //proses rerata
        rerata = (nilaiTugas + nilaiUlangan + nilaiUjian) / 3;

        System.out.println("Data atas nama= " + nama);
        System.out.println("Kelas= " + kelas);
        System.out.println("Nama guru= " + namaGuru);
        System.out.println("Rata-rata Nilai= " + rerata);

    }
}
