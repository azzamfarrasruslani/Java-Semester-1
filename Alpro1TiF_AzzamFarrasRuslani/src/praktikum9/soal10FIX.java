package alpro1tif_azzamfarrasruslani;

import javax.swing.JOptionPane;

/**
 *
 * @author Kelompok 6
 */
public class soal10FIX {

    public static void main(String[] args) {
        int harga, jmlOrg, i, jmlJam, hargaTotal, hargaDiskon, hargaFix, diskonToko, hargaFinal, uangBayar, kembalian;
        String pilihUlang, namaPaket, paket, metodeBayar, tanggal;

        System.out.println("\t\t   Warnet Cempaka  "
                + "\n\t\tJalan Umban Sari No.1 \n\t\t   Pekanbaru, Riau");

        do {
            jmlOrg = Integer.parseInt(JOptionPane.showInputDialog("Selamat Datang Di Warnet Cempaka \n         "
                    + "Masukan Jumlah orang "));
            metodeBayar = JOptionPane.showInputDialog("Masukan Metode Pembayaran");
            System.out.println("Jumlah Orang : " + jmlOrg);
            tanggal = JOptionPane.showInputDialog("Masukan Tanggal");
            System.out.println("Tanggal : " + tanggal + "\t\t\tBayar : " + metodeBayar);
            System.out.println("--------------------------------------------------");
            int tampungHarga = 0;
            String tampungPaket = "";
            for (i = 1; i <= jmlOrg; i++) {

                namaPaket = JOptionPane.showInputDialog("Silahkan Masukan nama paket  " + i);

                if (namaPaket.equalsIgnoreCase("bronze")) {
                    paket = "Bronze";
                    harga = 10_000;
                    jmlJam = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Jam "));
                    hargaTotal = harga * jmlJam;
                    if (jmlJam > 5) {
                        hargaDiskon = (int) (hargaTotal - (hargaTotal * 0.05));
                        hargaFix = hargaDiskon;
                    } else {
                        hargaFix = hargaTotal;
                    }
                    System.out.println(i + "\t" + paket + "\t\t" + jmlJam + "\t" + harga + "\t" + hargaFix);

                    tampungPaket += "-" + paket + "-";
                    tampungHarga += hargaFix;
                } else if (namaPaket.equalsIgnoreCase("silver")) {
                    paket = "Silver";
                    harga = 20_000;
                    jmlJam = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Jam "));
                    hargaTotal = harga * jmlJam;
                    if (jmlJam > 5) {
                        hargaDiskon = (int) (hargaTotal - (hargaTotal * 0.07));
                        hargaFix = hargaDiskon;
                    } else {
                        hargaFix = hargaTotal;
                    }
                    System.out.println(i + "\t" + paket + "\t\t" + jmlJam + "\t" + harga + "\t" + hargaFix);
                    tampungPaket += "-" + paket + "-";
                    tampungHarga += hargaFix;
                } else if (namaPaket.equalsIgnoreCase("gold")) {
                    paket = "Gold";
                    harga = 30_000;
                    jmlJam = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Jam "));
                    hargaTotal = harga * jmlJam;
                    if (jmlJam > 5) {
                        hargaDiskon = (int) (hargaTotal - (hargaTotal * 0.1));
                        hargaFix = hargaDiskon;
                    } else {
                        hargaFix = hargaTotal;
                    }
                    System.out.println(i + "\t" + paket + "\t\t" + jmlJam + "\t" + harga + "\t" + hargaFix);
                    tampungPaket += "-" + paket + "-";
                    tampungHarga += hargaFix;
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf Nama Paket tidak tersedian coba lagi");  
                }
            }
            if (jmlOrg >= 3) {
                diskonToko = tampungHarga - 10000;
                hargaFinal = diskonToko;
            } else {
                hargaFinal = tampungHarga;
            }

            uangBayar = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah uang yang dibayar\nTotal Harga :" + hargaFinal));
            kembalian = uangBayar - hargaFinal;

            while (hargaFinal > uangBayar) {
                JOptionPane.showMessageDialog(null, "Uang anda kurang");
                uangBayar = Integer.parseInt(JOptionPane.showInputDialog("Masukan lagi jumlah uang yang dibayar"));
                kembalian = uangBayar - hargaFinal;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("\t\tPaket :\t" + tampungPaket);
            System.out.println("\t\tTotal :\t" + hargaFinal);
            System.out.println("\t\tBayar :\t" + uangBayar);
            System.out.println("\t\tKembalian : " + kembalian);
            pilihUlang = JOptionPane.showInputDialog("Apakah adan ingin memesan lagi ?");
        } while (pilihUlang.equalsIgnoreCase("ya"));
        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Memesan ");
    }
}
