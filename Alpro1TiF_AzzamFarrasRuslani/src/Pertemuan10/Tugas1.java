package Pertemuan10;
//@author AZZAM FARRAS RUSLANI//
public class Tugas1 {

    public static void main(String[] args) {
        int total = 0;
        int[] data = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        System.out.println(total + 1);

        System.out.print(data[0] + 1 + "  ");
        System.out.print(data[3] + 5 + "  ");
        System.out.println(data[5] + 1 + "  ");
        
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + 5 + "  ");
        }
    }
}
