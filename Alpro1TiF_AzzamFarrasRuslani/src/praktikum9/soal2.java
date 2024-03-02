package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class soal2 {

    public static void main(String[] args) {
        String hari, nama, alamat, pengantar;
        int jmlTangki, i, ukuranBak, harga, totalHarga = 0, biayaAntar = 0, diskon, hargaFinal, hargaFix = 0;
       

        hari = JOptionPane.showInputDialog("Selamat Datang di Toko Air Berkarya\nUntuk hari apa pesanannya ?");
        nama = JOptionPane.showInputDialog("Masukan nama pemesan");
        alamat = JOptionPane.showInputDialog("Masukan alamat pesanan");

        jmlTangki = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah bak yang anda miliki?"));
        int tampungHarga = 0;
        int tampungBak = 0;
        String tampungPengantar = "";
        int tampungDiskon = 0; 
        for (i = 1; i <= jmlTangki; i++) {
            ukuranBak = Integer.parseInt(JOptionPane.showInputDialog("Berapa liter ukuran bak ke-" + i + " ?"));
            tampungBak += ukuranBak;
                if (hari.equalsIgnoreCase("senin")){
                    pengantar = "Bp.Joko";
                    harga = ukuranBak * 3500;
                    diskon = (int) ((harga * 0.07));
                    
                    hargaFinal = harga - diskon;
                    hargaFix = hargaFinal;
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                    tampungDiskon += diskon; 
                }
                else if (hari.equalsIgnoreCase("selasa")){
                    pengantar = "Bp.Budi dan Bp.Anto";
                    harga = ukuranBak * 3500;
                    hargaFix = harga;
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                }
                 else if (hari.equalsIgnoreCase("rabu")){
                    pengantar = "Bp.Anwar";
                    harga = ukuranBak * 3500;
                    diskon = (int) ((harga * 0.04));
                    
                    hargaFinal = harga - diskon;
                    hargaFix = hargaFinal;                
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                    tampungDiskon += diskon; 
                 }
                else if (hari.equalsIgnoreCase("kamis")){
                    pengantar = "Bp.Dani dan Bp.Budi";
                    harga = ukuranBak * 3500;
                    hargaFix = harga;
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                }
               else if (hari.equalsIgnoreCase("jumat")){
                    pengantar = "Bp.Zul";
                    harga = ukuranBak * 3500;
                    diskon = (int) ((harga * 0.1));
                  
                    hargaFinal = harga - diskon;
                    hargaFix = hargaFinal;
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                    tampungDiskon += diskon; 
               }
                else if (hari.equalsIgnoreCase("sabtu")){
                    pengantar = "Bp.Riswan";
                    harga = ukuranBak * 3500;
                    hargaFix = harga;
                    tampungHarga += hargaFix;
                    tampungPengantar +=pengantar;
                }
            

            if (tampungBak <= 20) {
                totalHarga = 10000 + tampungHarga;
                biayaAntar = 10000;
            } else if (tampungBak > 20 && tampungBak <= 30) {
                totalHarga = 7000 + tampungHarga;
                biayaAntar = 7000;
            } else {
                totalHarga = 5000 + tampungHarga;
                biayaAntar = 5000;
            }
        }
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(tampungBak);
        System.out.println(hari);
        System.out.println(tampungPengantar);
        System.out.println(hargaFix);
        System.out.println(totalHarga);
        System.out.println(biayaAntar);
        System.out.println(tampungDiskon);
        
    }
}
