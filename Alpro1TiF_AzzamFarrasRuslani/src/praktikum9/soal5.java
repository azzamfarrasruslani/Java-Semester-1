//package alpro1tif_azzamfarrasruslani;
//
//import javax.swing.JOptionPane;
//
///**
// *
// * @author 225 - PC 06
// */
//public class soal5 {
//
//    public static void main(String[] args) {
//
//        int noPelanggan, i, harga, jmlBrg, hargaFinal=0, diskonJml, diskonHarga, hargaAkhir, hargaFix,jmlBarang;
//        String tanggal, metodeBayar;
//          System.out.println("\t\tSupermarket Zigi Zaga \n\t\t    Toko Harian \n\t\tJalan Umban Sari No.1 \n\t\t   Pekanbaru, Riau");
//        noPelanggan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nomor Pelanggan"));
//        tanggal = JOptionPane.showInputDialog("Masukan Tanggal");
//        metodeBayar = JOptionPane.showInputDialog("Masukan Metode Pembayaran");
//        System.out.println("No. pelanggan : " + noPelanggan);
//        System.out.println("Tanggal : " + tanggal + "\t\tBayar : " + metodeBayar);
//        System.out.println("\t--------------------------------------------------");
//
//        int jmlBelanja = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//
//        int totalHarga = 0;
//       
//        for (i = 1; i <= jmlBelanja; i++) {
//            String namaBarang = JOptionPane.showInputDialog("Masukan Nama Barang " + i);
//          
//                
//                if (namaBarang.equals"Minyak Goreng":
//                    harga = 12000;
//                    jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//                    totalHarga = jmlBrg * harga;
//                    hargaFinal += totalHarga;
//                                     
//                    break;
//                case "Biskuit Roma":
//                    harga = 5000;
//                    jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//                    totalHarga = jmlBrg * harga;
//                    hargaFinal += totalHarga;
//                  
//                    break;
//                case "Tissue Paseo":
//                    harga = 15000;
//                    jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//                    totalHarga = jmlBrg * harga;
//                    hargaFinal += totalHarga;
//                
//                    break;
//                case "Oreo":
//                    harga = 10000;
//                    jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//                    totalHarga = jmlBrg * harga;
//                    hargaFinal += totalHarga;
//                    jmlBarang = jmlBrg;
//                  
//                    break;
//                case "Tango":
//                    harga = 8000;
//                    jmlBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));
//                    totalHarga = jmlBrg * harga;
//                    
//                    hargaFinal += totalHarga; 
//                  
//                    break;
//                    
//            }
//              System.out.println(i +""+ namaBarang +""+ jmlBarang +""+ hargaFinal);
//            
//        }
//        if (jmlBelanja > 2 ) {
//            diskonJml = (int) (hargaFinal - (hargaFinal * 0.1)); 
//            hargaAkhir = diskonJml;
//        } else {
//            hargaAkhir = hargaFinal;
//        }
//        
//        if (hargaFinal > 50000 ) {
//            hargaFix = (int) (hargaAkhir - (hargaAkhir * 0.05));  
//        } else {
//            hargaFix = hargaAkhir;
//        }
//
//        
//        
//        
//    }
//}
