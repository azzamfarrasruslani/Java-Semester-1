package LatihanArray2 ;

 //@author AZZAM FARRAS RUSLANI
public class Tugas1 {

    public static void main(String[] args) {
        double[] bil = {5.5, 7.7, 8.3, 9.0, 11.5};
        double total = 0.0, avg;
        int jmlBawah = 0;

        for (int i = 0; i < bil.length; i++) {
            total += bil[i];
        }
        avg = total / bil.length;

        for (int i = 0; i < bil.length; i++) {
            if (avg > bil[i]) {
                jmlBawah += 1;
            }
        }

        int index = 0;
        double min = bil[0];
        for (int i = 1; i < bil.length; i++) {
            if (bil[i] < min) {
                min = bil[i];
                index = i;
            }
        }
        System.out.println("Total Nilai Array : " + total);
        System.out.println("Rata-rata Nilai : " + avg);
        System.out.println("Banyak Bilangan Dibawah Rata-rata :" + jmlBawah);
        System.out.println("Nilai paling kecil berada di index :  ke- " + index);
    }
}
