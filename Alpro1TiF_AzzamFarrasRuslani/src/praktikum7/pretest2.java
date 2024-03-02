package praktikum7;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class pretest2 {

    public static void main(String[] args) {
        String namaAnak, namaPendamping, pilihPaket, fasilitas = null, namaPaket = null, diskonAnak = null;
        int hargaPaket = 0, totalHarga, hPendamping, hAnak, kelasAnak, totalDiskonAgen;

        // meminta input
        namaAnak = JOptionPane.showInputDialog("Masukan Nama Anak");
        namaPendamping = JOptionPane.showInputDialog("Masukan Nama Pendamping");
        pilihPaket = JOptionPane.showInputDialog("Pilih Nama Paket" + "\nPaket 1 : Amazing Turki Tour" + "\nPaket 2 : Bangkok Pattaya Tour" + "\nPaket 3 : Paket Wisata Derawan" + "\nPaket 4 : Exotic Bali Package");
        kelasAnak = Integer.parseInt(JOptionPane.showInputDialog("Masukan Kelas Anak" + "\nKelas 1-3 : Diskon 50%" + "\nKelas 4-6 : Diskon 35%"));

        if (pilihPaket.equalsIgnoreCase("Paket 1")) {
            namaPaket = "Amazing Turki Tour";
            fasilitas = "4D/3N, SDF- City Tour-Bandara, Hotel bintang 5, Makan 2x Sehari,Souvenir";
            hargaPaket = 17500000;
        } else if (pilihPaket.equalsIgnoreCase("Paket 2")) {
            namaPaket = "Bangkok Pattaya Tour";
            fasilitas = "3D/2N, Tiket Bangkok-Jakarta, Hotel bintang 3, Makan 2x Sehari, Souvenir";
            hargaPaket = 1620000;
        } else if (pilihPaket.equalsIgnoreCase("Paket 3")) {
            namaPaket = "Paket Wisata Derawan";
            fasilitas = "3D/2N, Tiket Jakarta-Kalimantan, Hotel bintang 2, Makan 2x Sehari,Souvenir";
            hargaPaket = 2075000;
        } else if (pilihPaket.equalsIgnoreCase("Paket 4")) {
            namaPaket = "Exotic Bali Package";
            fasilitas = "5D/4N, Tiket Jakarta-Bali, Hotel bintang 4, Makan 2x Sehari, Souvenir";
            hargaPaket = 1338000;
        } else {
            JOptionPane.showMessageDialog(null, "Paket Tidak Tersedia");
        }

        if (kelasAnak >= 1 && kelasAnak <= 3) {
            hAnak = (int) (hargaPaket - (hargaPaket * 0.5));
            diskonAnak = "50%";
        } else if (kelasAnak >= 4 && kelasAnak <= 6) {
            hAnak = (int) (hargaPaket - (hargaPaket * 0.35));
            diskonAnak = "35%";
        } else {
            JOptionPane.showMessageDialog(null, "Anda Tidak Dapat Potongan Harga");
            hAnak = hargaPaket;
        }

        hPendamping = hargaPaket;
        totalHarga = hPendamping + hAnak;
        totalDiskonAgen = (int) (totalHarga - (totalHarga * 0.15));

        JOptionPane.showMessageDialog(null, "Nama Anak : " + namaAnak + "\nNama Pendamping : " + namaPendamping + "\nKelas Anak : " + kelasAnak + "\nNama Paket : " + namaPaket + "\nFasilitas : " + fasilitas + "\nDiskon Kelas Anak : " + diskonAnak + "\nHarga Anak : " + hAnak + "\nHarga Pendamping : " + hPendamping + "\nTotal Harga : " + totalDiskonAgen);
    }
}
