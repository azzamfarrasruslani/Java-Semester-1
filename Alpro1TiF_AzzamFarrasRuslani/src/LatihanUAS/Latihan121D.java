
package LatihanUAS;


public class Latihan121D {
    public static void main(String[] args) {
        String[] merk = {"ASUS", "LENOVO", "DELL", "ASUS", "ACER"};
        int[] stok = {5, 3, 2, 1, 4};
        String[] memory = {"8 GB DDR3", "16GB LPDDR3", "8GB DDR4", "4 GB", "4GB DDR3"};
        String[] processor = {"CPU AMD Ryzen", "Intel Core i7", "Intel Core i7", "Intel cerelon", "Intel Core i3"};
        double[] harga = {7099000, 17850000, 12155000, 9500000, 8250000};

        // Menampilkan semua data
        System.out.println("Data Toko Laptop Surya Computer:");
        for (int i = 0; i < merk.length; i++) {
            System.out.println("Merk: " + merk[i]);
            System.out.println("Stok: " + stok[i]);
            System.out.println("Memory: " + memory[i]);
            System.out.println("Processor: " + processor[i]);
            System.out.println("Harga: Rp. " + harga[i]);
            System.out.println("-----------------------------");
        }

        // Pencarian berdasarkan merk
        String targetMerk = "ASUS";
        System.out.println("Pencarian berdasarkan merk " + targetMerk + ":");
        for (int i = 0; i < merk.length; i++) {
            if (merk[i].equals(targetMerk)) {
                System.out.println("Merk: " + merk[i]);
                System.out.println("Stok: " + stok[i]);
                System.out.println("Memory: " + memory[i]);
                System.out.println("Processor: " + processor[i]);
                System.out.println("Harga: Rp. " + harga[i]);
                System.out.println("-----------------------------");
            }
        }

        // Pencarian berdasarkan range harga
        double minHarga = 8000000;
        double maxHarga = 12000000;
        System.out.println("Pencarian berdasarkan range harga Rp. " + minHarga + " - Rp. " + maxHarga + ":");
        for (int i = 0; i < harga.length; i++) {
            if (harga[i] >= minHarga && harga[i] <= maxHarga) {
                System.out.println("Merk: " + merk[i]);
                System.out.println("Stok: " + stok[i]);
                System.out.println("Memory: " + memory[i]);
                System.out.println("Processor: " + processor[i]);
                System.out.println("Harga: Rp. " + harga[i]);
                System.out.println("-----------------------------");
            }
        }

        // Menghitung total omset, harga rata-rata, dan jumlah laptop di atas rata-rata
        double totalOmset = 0;
        double rataRataHarga = 0;
        int jumlahLaptopDiAtasRataRata = 0;

        for (double h : harga) {
            totalOmset += h;
        }

        rataRataHarga = totalOmset / harga.length;

        for (double h : harga) {
            if (h > rataRataHarga) {
                jumlahLaptopDiAtasRataRata++;
            }
        }

        System.out.println("Total Omset: Rp. " + totalOmset);
        System.out.println("Harga Rata-rata: Rp. " + rataRataHarga);
        System.out.println("Jumlah Laptop di atas rata-rata: " + jumlahLaptopDiAtasRataRata);
    } 
}
