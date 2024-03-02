package Pertemuan14;

import java.io.*;
//@author AZZAM FARRAS RUSLANI

public class perbaikanPC8 {

    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() throws IOException {
        System.out.println(20 / 0);
        System.out.println("Method B");
    }
}

class Utama {

    public static void main(String[] args) throws IOException {
        perbaikanPC8 c = new perbaikanPC8();
        c.methodA();
        try {
            c.methodB();
        } catch (ArithmeticException e) {
            System.out.println("IOException caught: " + e.getMessage());
            System.out.println("Terjadi Aritmatika Error");
        }
    }
}
