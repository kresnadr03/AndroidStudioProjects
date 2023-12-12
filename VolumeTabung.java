import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        // Membaca nilai jari-jari dan tinggi dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin menghitung (1) Volume atau (2) Luas Permukaan tabung? ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jari-jari tabung: ");
            double jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi tabung: ");
            double tinggi = scanner.nextDouble();

            // Menghitung volume tabung
            double volume = hitungVolumeTabung(jariJari, tinggi);

            // Menampilkan hasil
            System.out.println("Volume tabung dengan jari-jari " + jariJari +
                    " dan tinggi " + tinggi + " adalah: " + volume);

        } else if (pilihan == 2) {
            System.out.print("Masukkan jari-jari tabung: ");
            double jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi tabung: ");
            double tinggi = scanner.nextDouble();

            // Menghitung volume tabung
            double volume = hitungLuasPermukaanTabung(jariJari, tinggi);

            // Menampilkan hasil
            System.out.println("Volume tabung dengan jari-jari " + jariJari +
                    " dan tinggi " + tinggi + " adalah: " + volume);
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }
        // Menutup scanner
        scanner.close();
    }

    // Metode untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = 22 / 7 * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
    public static double hitungLuasPermukaanTabung(double jariJari, double tinggi) {
        double volume = 2 * 22 / 7 * Math.pow(jariJari, 2) + 2 * 22/7 * jariJari * tinggi;
        return volume;
    }
}
