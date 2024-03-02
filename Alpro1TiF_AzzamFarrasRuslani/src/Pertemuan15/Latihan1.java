package Pertemuan15;

import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class Latihan1 {

    public static void main(String[] args) {
        int jumLK = 0, jumPR = 0, byakStatusAkses = 0;
        int konversiSaldo = 0, isiSaldo = 0;
        String dataSaldo = "";

        int jumlahAkun = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah Akun Yang ingin REGISTRASI"));
        String regis[][] = new String[jumlahAkun][8];
        String login[][] = new String[10][3];

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Pilih MENU: "
                + "\n1. REGISTASI AKUN"
                + "\n2. LOGIN"
                + "\n3. TAMPIL DATA REGISTRASI "
                + "\n4. TAMPIL DATA LOGIN "
                + "\n5. KELUAR"));

        while (menu == 1 || menu == 2 || menu == 3 || menu == 4) {
            if (menu == 1) {//REGISTRASI

                for (int i = 0; i < jumlahAkun; i++) {//baris
                    //input username
                    regis[i][0] = JOptionPane.showInputDialog("Masukkan username REGISTER ke " + i);

                    try {//input Password
                        regis[i][1] = JOptionPane.showInputDialog("Masukkan Password dengan Username " + regis[i][0]);
                        if (regis[i][1].length() > 6) {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR, Password Harus 6 Karakter maximal");
                        regis[i][1] = JOptionPane.showInputDialog("Masukkan ULANG password yang benar " + regis[i][0]);
                    }

                    try {//input Umur
                        regis[i][2] = JOptionPane.showInputDialog("Masukkan UMUR dengan Username " + regis[i][0]);
                        int konversiUmur = Integer.parseInt(regis[i][2]);
                        if (konversiUmur < 17) {
                            throw new Exception();
                        }
                        regis[i][7] = "ACCESS"; //Status Umur
                        byakStatusAkses++; //menambahkan akun yang dapat akses login
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR, MAAF! AKUN Terdaftar tetapi tidak bisa LOGIN (BLOCK ACCESS)");
                        regis[i][7] = "BLOCK";
                    }

                    try {//input Gender
                        regis[i][3] = JOptionPane.showInputDialog("Masukkan GENDER dengan Username " + regis[i][0]);
                        if (!regis[i][3].equalsIgnoreCase("LK") && !regis[i][3].equalsIgnoreCase("PR")) {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "ERROR, Gender harus dalam format PR/LK");
                        regis[i][3] = JOptionPane.showInputDialog("Masukkan ULANG Gender yang benar " + regis[i][0]);
                    }

                    regis[i][4] = null; //Status Pembelian
                    regis[i][5] = null; //total harga beli
                    regis[i][6] = null; //saldo

                    //pengecekkan data
                    if (regis[i][3].equalsIgnoreCase("LK")) {
                        jumLK++;
                    } else {
                        jumPR++;
                    }
                }
            } else if (menu == 2) { //LOGIN
                int ulangLogin = 0;
                try {
                    while (ulangLogin < 3) {
                        String uname = JOptionPane.showInputDialog("Inputkan Username LOGOIN");
                        String pass = JOptionPane.showInputDialog("Masukkan Password LOGIN");
                        for (int i = 0; i < login.length; i++) {
                            if (uname.equalsIgnoreCase(regis[i][0]) && pass.equalsIgnoreCase(regis[i][1]) && regis[i][7].equalsIgnoreCase("ACCESS")) {
                                //kondisinya ada 3, username, pass, dan status umur
                                login[i][0] = uname;
                                login[i][1] = pass;
                                login[i][2] = "LOGIN BERHASIL " + ulangLogin + " KALI";
                                ulangLogin = 4; //agar tidak login lagi
                                //MASUK MENU DALAM LOGIN
                                int menuDalam = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu : "
                                        + "\n1. UPDATE DATA "
                                        + "\n2. DELETE DATA"
                                        + "\n3. ISI SALDO"
                                        + "\n4. BELI TIKET"
                                        + "\n5. KELUAR"));

                                while (menuDalam == 1 || menuDalam == 2 || menuDalam == 3 || menuDalam == 4) {
                                    switch (menuDalam) {
                                        case 1:
                                            JOptionPane.showMessageDialog(null, "UPDATE DATA REGISTER");
                                            int kolom = Integer.parseInt(JOptionPane.showInputDialog("masukkn index kolom yang ingin di Update "
                                                    + "\n0. username"
                                                    + "\n1. Password"
                                                    + "\n2. Umur"
                                                    + "\n3. gender"));
                                            String dataUpdate = JOptionPane.showInputDialog("Inputkan Data yang ingin di Update berdsarkan kolom ke " + kolom);

                                            System.out.println("TAMPIL DATA AKUN REGISTER SETELAH UPDATE");
                                            System.out.println("USERNAME \t PASSWORD \t UMUR \t GENDER \t STATUS BELI \t HARGA \t SALDO \t STATUS UMUR");

                                            for (int j = 0; j < regis[i].length; j++) {//for cari data update
                                                if (dataUpdate.equalsIgnoreCase(regis[i][j])) {
                                                    regis[i][j] = JOptionPane.showInputDialog("Masukkan Data Update terbaru kolom " + j);
                                                    JOptionPane.showMessageDialog(null, "Data berhasil DI UPDATE");
                                                }
                                                System.out.print(regis[i][j] + " \t "); //tampil data 
                                            }
                                            System.out.println("");
                                            break;

                                        case 2:
                                            JOptionPane.showMessageDialog(null, "DELETE DATA REGISTER");
                                            String dataDelete = JOptionPane.showInputDialog("Inputkan Data yang ingin di Delete berdsarkan kolom ke ");
                                            for (int k = 0; k < regis[i].length; k++) {
                                                if (dataDelete.equalsIgnoreCase(regis[i][k])) {
                                                    regis[i][k] = null; //hapus 1 baris
                                                }
                                            }
                                            break;
                                        case 3:
                                            JOptionPane.showMessageDialog(null, "SILAHKAN ISI SALDO AKUN");
                                            isiSaldo = Integer.parseInt(JOptionPane.showInputDialog("masukkan nominal RP saldo yang ingin diisi"));
                                            konversiSaldo += isiSaldo;

                                            regis[i][6] = Integer.toString(konversiSaldo);

                                            break;
                                        case 4:
                                            String pilKonser = JOptionPane.showInputDialog("masukkan pilihan konser");
                                            String harga = "";
                                            switch (pilKonser) {
                                                case "blackpink":
                                                    harga = "1000000";
                                                    konversiSaldo -= 1000000;
                                                    break;
                                                case "exo":
                                                    harga = "1500000";
                                                    konversiSaldo -= 1500000;
                                                    break;
                                                case "bts":
                                                    harga = "1750000";
                                                    konversiSaldo -= 1750000;
                                                    break;
                                                case "noah":
                                                    harga = "2000000";
                                                    konversiSaldo -= 2000000;
                                                    break;
                                                default:
                                                    konversiSaldo -= 0;
                                                    break;
                                            }
                                            if (konversiSaldo < 0) {
                                                JOptionPane.showMessageDialog(null, "Anda berhutang , saldo tidak cukup");
                                            }
                                            regis[i][4] = "Beli Tiket " + pilKonser;
                                            regis[i][5] = harga;
                                            regis[i][6] = Integer.toString(konversiSaldo);//mengkonversi dari integer ke String , sisa saldo

                                            break;
                                    }
                                    menuDalam = Integer.parseInt(JOptionPane.showInputDialog("Pilih menu LAGI : "
                                            + "\n1. UPDATE DATA "
                                            + "\n2. DELETE DATA"
                                            + "\n3. ISI SALDO"
                                            + "\n4. BELI TIKET"
                                            + "\n5. KELUAR"));
                                }

                            } else {
                                throw new Exception();
                            }
                        }

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR, Ulang Login ke " + ulangLogin + "\nLOGIN Maximal 3 kali");
                    ulangLogin++;
                }

            } else if (menu == 3) {//tampil informasi data registrasi

                System.out.println("TAMPIL DATA AKUN REGISTER");
                System.out.println("USERNAME \t\t PASSWORD \t UMUR \t GENDER \t STATUS BELI \t HARGA \t SALDO \t STATUS UMUR");
                for (int i = 0; i < regis.length; i++) {
                    for (int j = 0; j < regis[i].length; j++) {
                        System.out.print(regis[i][j] + " \t ");
                    }
                    System.out.println("");
                }
                System.out.println("JUMLAH YANG MASUK KE TABEL REGISTER SEBANYAK " + jumlahAkun);
                System.out.println("Jumlah LAKI-LAKI " + jumLK);
                System.out.println("Jumlah PEREMPUAN " + jumPR);
                System.out.println("Jumlah yang dapat ACCESS LOGIN" + byakStatusAkses);

            } else if (menu == 4) {//tampil informasi akun yang login
                System.out.println("TAMPIL DATA AKUN LOGIN");
                System.out.println("USERNAME \t PASSWORD \t STATUS LOGIN");
                for (int i = 0; i < login.length; i++) {
                    for (int j = 0; j < login[i].length; j++) {
                        System.out.print(login[i][j] + " \t\t ");
                    }
                    System.out.println("");
                }
            } else {
                break;
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Pilih MENU LAGI: "
                    + "\n1. REGISTASI AKUN"
                    + "\n2. LOGIN"
                    + "\n3. TAMPIL DATA REGISTRASI "
                    + "\n4. TAMPIL DATA LOGIN "
                    + "\n5. KELUAR"));

        }
    }
}
