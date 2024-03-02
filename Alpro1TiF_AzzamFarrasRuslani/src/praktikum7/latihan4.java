package praktikum7;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class latihan4 {

    public static void main(String[] args) {
        String nama, jenisPakaian, merek = null, member, diskon = null, diskonMember = null;
        int jumlahPakaian, harga = 0, hargaDiskon, hargaSatuan, totalHarga, hargaMember;

        nama = JOptionPane.showInputDialog("Masukan Nama Pelanggan");
        member = JOptionPane.showInputDialog("Apakah Ada Member Card ?");
        jenisPakaian = JOptionPane.showInputDialog("Masukan Jenis Pakaian" + "\nJenis 1 = ABC" + "\nJenis 2 = DEF" + "\nJenis3 = GHI");
        jumlahPakaian = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Pakaian"));

        switch (jenisPakaian) {
            case "1":
                merek = "ABC";
                hargaSatuan = 100000;
                harga = hargaSatuan;
                if (jumlahPakaian >= 2) {
                    merek = "ABC";
                    diskon = "10%";
                    hargaDiskon = (int) (hargaSatuan - (hargaSatuan * 0.1));
                    harga = hargaDiskon;
                }
                break;
            case "2":
                merek = "DEF";
                hargaSatuan = 250000;
                harga = hargaSatuan;
                if (jumlahPakaian >= 2) {
                    merek = "DEF";
                    diskon = "15%";
                    hargaDiskon = (int) (hargaSatuan - (hargaSatuan * 0.15));
                    harga = hargaDiskon;
                }
                break;
            case "3":
                merek = "GHI";
                hargaSatuan = 350000;
                harga = hargaSatuan;
                if (jumlahPakaian >= 2) {
                    merek = "GHI";
                    diskon = "20%";
                    hargaDiskon = (int) (hargaSatuan - (hargaSatuan * 0.20));
                    harga = hargaDiskon;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Merek tidak terdaftar");
                break;
        }

        if (member.equalsIgnoreCase("ada")) {
            hargaMember = (int) (harga - (harga * 0.05));
            totalHarga = jumlahPakaian * hargaMember;
            diskonMember = "5%";
        } else {
            totalHarga = jumlahPakaian * harga;
        }

        JOptionPane.showMessageDialog(null, "Nama Pelanggan : " + nama + "\nJumlah Pakaian : " + jumlahPakaian + "\nMerek Pakaian : " + merek + "\nDiskon yang didapat : " + diskon + "\nDiskon Member yang didapat : " + diskonMember + "\nTotal Harga : " + totalHarga);

    }
}
