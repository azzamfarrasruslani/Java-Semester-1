package praktikum8;

import java.util.Scanner;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class tugas2 {

    public static void main(String[] args) {
        int coba = 0, maxCoba = 3, pilihMenu, saldoAwal = 3000000, tarikTunai, nominal;
        String pin, pinBenar = "123456";
        Scanner input = new Scanner(System.in);

        while (coba < maxCoba) {
            System.out.println("-----Masukan Pin ATM Anda-----");
            pin = input.nextLine();
            if (pin.equals(pinBenar)) {

                    System.out.println("-----Pilihan Menu----- \n1. Tarik Tunai \n2. Cek Saldo \n(1/2/3)");
                    pilihMenu = input.nextInt();
                    switch (pilihMenu) {
                        case 1:
                            System.out.println("-----Masukan Nominal Uang Yang Akan Di Tarik-----");
                            nominal = input.nextInt();
                            tarikTunai = saldoAwal - nominal;
                            System.out.println("sisa SALDO ANDA"+tarikTunai );
                            System.exit(coba);
                            break;
                        case 2:
                            System.out.println("Jumlah Saldo Awal Anda Rp. " + saldoAwal);
                            System.exit(coba);
                            break;  
                        default:
                            System.out.println("Menu yang anda masukan salah, Coba lagi");
                            break;

                }

            } else {
                System.out.println("Pin Yang Anda Masukan Salah, Input Ulang Pin Anda");
                coba++;
            }
            if (coba == maxCoba) {
                System.out.println("Anda Telah Mencapai limit");
            }
        }

    }

}
