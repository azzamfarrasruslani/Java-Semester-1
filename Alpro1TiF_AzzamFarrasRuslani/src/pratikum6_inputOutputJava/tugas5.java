package pratikum6_inputOutputJava;

/**
 *
 * @author AZZAM FARRAS RUSLANI, 1 TI F
 */
public class tugas5 {

    public static void main(String[] args) {

        //Untuk target nya adalah kata {contoh} jadi perhatikan reaksi penggunaan escape character kata {contoh} 
        // dan kondisi nya tanda "=" tidak ada spasi diantara kata contoh ex: =contoh
        // \t ==> Menambahkan tab pada text
        System.out.println(" 1) Ini merupakan contoh penggunaan escape backslash t =\tcontoh ");
        // \b ==> Menambahkan backspace pada text
        System.out.println(" 2) Ini merupakan contoh penggunaan escape backslash b =contoh\b ");
        // \n ==> Menambahkan baris baru pada text
        System.out.println(" 3) Ini merupakan contoh penggunaan escape backslash n =\n    contoh ");
        // \r ==> Mengarahkan kursor ke awal baris
        System.out.print(" 4) Ini merupakan contoh penggunaan escape r bagian1  =contoh123 ");
        System.out.println("\r 4) Ini merupakan contoh penggunaan escape backslash r bagian2  =contohABC"); //bagian 1 digantikan oleh bagian 2
        // \f ==> Menambahkan halaman baru pada text
        System.out.println(" 5) Ini merupakan contoh penggunaan escape backslash f =\fcontoh");
        // \' ==> Menambahkan tanda petik tunggal pada text
        System.out.println(" 6) Ini merupakan contoh penggunaan escape backslash petik tuggal =\'contoh\'");
        // \" ==> Menambahkan tanda petik ganda pada text
        System.out.println(" 7) Ini merupakan contoh penggunaan escape backslash petik ganda =\"contoh\"");
        // \\ ==> Menambahkan karakter garis / pada text
        System.out.print(" 8) Ini merupakan contoh penggunaan escape backslash double  =\\contoh\\");
    }
}
