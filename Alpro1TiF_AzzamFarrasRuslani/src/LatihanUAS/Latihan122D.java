
package LatihanUAS;


public class Latihan122D {
    public static void main(String[] args) {
        String[][] dataLaptop = {
                {"ASUS", "5", "8 GB DDR3", "CPU AMD Ryzen", "7099000"},
                {"LENOVO", "3", "16GB LPDDR3", "Intel Core i7", "17850000"},
                {"DELL", "2", "8GB DDR4", "Intel Core i7", "12155000"},
                {"ASUS", "1", "4 GB", "Intel cerelon", "9500000"},
                {"ACER", "4", "4GB DDR3", "Intel Core i3", "8250000"}
        };

        // Menampilkan semua data
        System.out.println("Data Toko Laptop Surya Computer:");
        for (String[] laptop : dataLaptop) {
            System.out.println("Merk: " + laptop[0]);
            System.out.println("Stok: " + laptop[1]);
            System.out.println("Memory: " + laptop[2]);
            System.out.println("Processor: " + laptop[3]);
            System.out.println("Harga: Rp. " + laptop[4]);
            System.out.println("-----------------------------");
        }

        // Pencarian berdasarkan merk
        String targetMerk = "ASUS";
        System.out.println("Pencarian berdasarkan merk " + targetMerk + ":");
        for (String[] laptop : dataLaptop) {
            if (laptop[0].equals(targetMerk)) {
                System.out.println("Merk: " + laptop[0]);
                System.out.println("Stok: " + laptop[1]);
                System.out.println("Memory: " + laptop[2]);
                System.out.println("Processor: " + laptop[3]);
                System.out.println("Harga: Rp. " + laptop[4]);
                System.out.println("-----------------------------");
            }
        }

        // Pencarian berdasarkan range harga
        double minHarga = 8000000;
        double maxHarga = 12000000;
        System.out.println("Pencarian berdasarkan range harga Rp. " + minHarga + " - Rp. " + maxHarga + ":");
        for (String[] laptop : dataLaptop) {
            double harga = Double.parseDouble(laptop[4]);
            if (harga >= minHarga && harga <= maxHarga) {
                System.out.println("Merk: " + laptop[0]);
                System.out.println("Stok: " + laptop[1]);
                System.out.println("Memory: " + laptop[2]);
                System.out.println("Processor: " + laptop[3]);
                System.out.println("Harga: Rp. " + laptop[4]);
                System.out.println("-----------------------------");
            }
        }

        // Menghitung total omset, harga rata-rata, dan jumlah laptop di atas rata-rata
        double totalOmset = 0;
        double rataRataHarga = 0;
        int jumlahLaptopDiAtasRataRata = 0;

        for (String[] laptop : dataLaptop) {
            double harga = Double.parseDouble(laptop[4]);
            totalOmset += harga;
        }

        rataRataHarga = totalOmset / dataLaptop.length;

        for (String[] laptop : dataLaptop) {
            double harga = Double.parseDouble(laptop[4]);
            if (harga > rataRataHarga) {
                jumlahLaptopDiAtasRataRata++;
            }
        }

        System.out.println("Total Omset: Rp. " + totalOmset);
        System.out.println("Harga Rata-rata: Rp. " + rataRataHarga);
        System.out.println("Jumlah Laptop di atas rata-rata: " + jumlahLaptopDiAtasRataRata);
    } 
}
