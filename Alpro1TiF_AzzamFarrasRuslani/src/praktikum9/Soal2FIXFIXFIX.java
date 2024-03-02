//package alpro1tif_azzamfarrasruslani;
//
//import javax.swing.JOptionPane;
//
///**
// *
// * @author AZZAM FARRAS RUSLANI
// */
//public class Soal2FIXFIXFIX {
//
//    public static void main(String[] args) {
//        String hari = JOptionPane.showInputDialog("Selamat datang di Toko Air Berkarya "
//                + "Untuk hari apa pemesanannya?");
//        String nama = JOptionPane.showInputDialog(null, "Masukkan nama pemesan");
//        String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat pemesan");
//        String inputAir = JOptionPane.showInputDialog(null, "Masukkan jumlah air dalam liter");
//        int jumlahAir = Integer.parseInt(inputAir);
//        int hargaPerLiter = 3500;
//        int biayaAntar = 0;
//        if (jumlahAir < 20) {
//            biayaAntar = 10000;
//        } else if (jumlahAir >= 20 && jumlahAir <= 30) {
//            biayaAntar = 7000;
//        } else {
//            biayaAntar = 5000;
//        }
//        hari = getHari();
//        String namaPengantar = getNamaPengantar(hari);
//        double diskon = getDiskon(hari);
//        int totalHarga = (jumlahAir * hargaPerLiter) + biayaAntar;
//        double hDiskon = totalHarga * diskon;
//        double tSeluruh = totalHarga - hDiskon;
//        String pesan = "Terima kasih telah memesan.\n Pesanan anda adalah sbb:\n\n"
//                + "Nama Pemesan: " + nama + "\n"
//                + "Alamat Pemesan: " + alamat + "\n"
//                + "Total pemesanan: " + jumlahAir + "liter" + "\n"
//                + "Hari Pengantaran: " + hari + "\n"
//                + "Nama Pengantar: " + namaPengantar + "\n"
//                + "Total Biaya: Rp " + tSeluruh + "\n"
//                + "Biaya Antar: Rp " + biayaAntar + "\n"
//                + "Anda hemat: " + hDiskon;
//        JOptionPane.showMessageDialog(null, pesan);
//    }
//
//    public static String getHari() {
//        return "Senin";
//    }
//
//    public static String getNamaPengantar(String hari) {
//        switch (hari) {
//            case "Senin":
//                return "Bp. Joko";
//            case "Selasa":
//                return "Bp. Budi dan Bp. Anto";
//            case "Rabu":
//                return "Bp. Anwar";
//            case "Kamis":
//                return "Bp. Dani dan Bp. Budi";
//            case "Jumat":
//                return "Bp. Zul";
//            case "Sabtu":
//                return "Bp. Riswan";
//            default:
//                return "Tidak ada informasi pengantar untuk hari ini";
//        }
//    }
//
//    public static double getDiskon(String hari) {
//        switch (hari) {
//            case "Senin":
//                return 0.07;
//            case "Rabu":
//                return 0.04;
//            case "Jumat":
//                return 0.1;
//            default:
//                return 0.0;
//        
//    
//
//        
//
//    
//
//    
//        }
//    }
//}
