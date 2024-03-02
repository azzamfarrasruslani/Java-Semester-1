/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5_IntroJava;

/**
 *
 * @author 225 - PC 04
 */
public class Laprak_Soal5 {
    public static void main (String[] args) {
        //insisiai
        int jml_menu1 = 2;
        int jml_menu2 = 5;
        int harga_menu1 = 15000;
        int harga_menu2 = 12000;
        int total_harga;
        
        //proses
        total_harga = (jml_menu1 * harga_menu1)+ (jml_menu2 * harga_menu2);
        
        //total harga
        System.out.println("Total Harga Makanan adalah Rp. " + total_harga);
        
    }
}
