package LatihanUAS;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AZZAM FARRAS RUSLANI
 */
public class LoginArray2D {

    public static void main(String[] args) {
        // Data pengguna (Username dan Password)
        String[][] accounts = {
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };

        int attemptLimit = 3;
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < attemptLimit && !loggedIn) {
            try {
                String inputUsername = JOptionPane.showInputDialog(null, "Masukkan username:");
                String inputPassword = JOptionPane.showInputDialog(null, "Masukkan password:");

                // Proses login
                for (int i = 0; i < accounts.length; i++) {
                    String storedUsername = accounts[i][0];
                    String storedPassword = accounts[i][1];

                    if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
                        loggedIn = true;
                        break;
                    }
                }

                // Output hasil login
                if (loggedIn) {
                    JOptionPane.showMessageDialog(null, "Login berhasil!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal. Username atau password salah. Coba lagi.");
                    attempts++;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan. Silakan coba lagi.");
                attempts++;
            }
        }

        if (!loggedIn) {
            JOptionPane.showMessageDialog(null, "Batas percobaan login telah habis. Program berakhir.");
        }
    }
}
