package Pertemuan10;

import javax.swing.JOptionPane;
//@author AZZAM FARRAS RUSLANI//

public class Tugas2 {

    public static void main(String[] args) {
//        String input, output;
        int jmlData = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Data"));
        String[][] nama = new String[jmlData][2];
        for (int i = 0; i < jmlData; i++) {
            nama[i][0] = JOptionPane.showInputDialog("Masukan Nama");
//                input = nama[i];
            nama[i][1] = nama[i][0].replaceAll("[a,i,u,e,o,A,I,U,E,O]", "");
//                output = nama[i];
//                System.out.println("Input=" + input + "\t\t  |   Output = " + output);
        }
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Input=" + nama[i][0] + "\t\t  |   Output = " + nama[i][1]);
        }
    }
}
