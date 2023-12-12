import java.util.Scanner;

public class DeretAritmatika {
    public static void main(String[] args) {
        // Membaca nilai awal (a), beda (d), dan jumlah suku (n) dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai awal (a): ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan beda (d): ");
        double d = scanner.nextDouble();
        System.out.print("Masukkan jumlah suku (n): ");
        int n = scanner.nextInt();

        // Menghitung jumlah deret aritmatika
        double jumlah = hitungJumlahDeretAritmatika(a, d, n);

        // Menampilkan hasil
        System.out.println("Jumlah deret aritmatika dengan nilai awal " + a +
                           ", beda " + d + ", dan jumlah suku " + n + " adalah: " + jumlah);

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk menghitung jumlah deret aritmatika
    public static double hitungJumlahDeretAritmatika(double a, double d, int n) {
        double jumlah = (n / 2.0) * (2 * a + (n - 1) * d);
        return jumlah;
    }
}
