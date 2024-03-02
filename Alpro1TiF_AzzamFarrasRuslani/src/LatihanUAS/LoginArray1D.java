
package LatihanUAS;
import java.util.Scanner;
/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class LoginArray1D {
    public static void main(String[] args) {
        // Data pengguna (Username dan Password)
        String[] usernames = {"user1", "user2", "user3"};
        String[] passwords = {"pass1", "pass2", "pass3"};

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Proses login
        boolean loggedIn = false;

        for (int i = 0; i < usernames.length; i++) {
            if (inputUsername.equals(usernames[i]) && inputPassword.equals(passwords[i])) {
                loggedIn = true;
                break;
            }
        }

        // Output hasil login
        if (loggedIn) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        // Menutup scanner
        scanner.close();
    }
}
