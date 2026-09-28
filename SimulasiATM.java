import java.util.Scanner;

// Lovely Narwastu Malau | 265150400111019 | PemDas D | 2026 //
public class SimulasiATM {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
        String abc = scanner.nextLine();
        double PIN, UserPin;
        int trial;
        PIN = 256173;
        trial = 2;

            System.out.println("Selamat datang di ATM FILKOM UB! Silakan masukkan PIN Anda.");
            UserPin = Double.parseDouble(abc);

            while (UserPin != PIN && trial != 0) {
                System.out.println("PIN yang Anda masukkan salah. Silakan coba lagi.");
                abc = scanner.nextLine();
                UserPin = Double.parseDouble(abc);
                trial--;
            }

            if (UserPin == PIN) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Akun Terblokir.");
            }
        }
    }
}
