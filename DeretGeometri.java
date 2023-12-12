import java.util.Scanner;

public class DeretGeometri {
    public static void main(String[] args) {
        // Membaca nilai awal (a), rasio (r), dan jumlah suku (n) dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai awal (a): ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan rasio (r): ");
        double r = scanner.nextDouble();
        System.out.print("Masukkan jumlah suku (n): ");
        int n = scanner.nextInt();

        // Menghitung jumlah deret geometri
        double jumlah = hitungJumlahDeretGeometri(a, r, n);

        // Menampilkan hasil
        System.out.println("Jumlah deret geometri dengan nilai awal " + a +
                           ", rasio " + r + ", dan jumlah suku " + n + " adalah: " + jumlah);

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk menghitung jumlah deret geometri
    public static double hitungJumlahDeretGeometri(double a, double r, int n) {
        double jumlah = a * (Math.pow(r, n) - 1) / (r - 1);
        return jumlah;
    }
}
