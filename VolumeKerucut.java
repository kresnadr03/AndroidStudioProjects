import java.util.Scanner;

public class VolumeKerucut {
    public static void main(String[] args) {
        // Membaca nilai jari-jari dan tinggi dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin menghitung (1) Volume atau (2) Luas Permukaan kerucut? ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jari-jari kerucut: ");
            double jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi kerucut: ");
            double tinggi = scanner.nextDouble();

            // Menghitung volume tabung
            double volume = hitungVolumeKerucut(jariJari, tinggi);

            // Menampilkan hasil
            System.out.println("Volume kerucut dengan jari-jari " + jariJari +
                    " dan tinggi " + tinggi + " adalah: " + volume);

            // Menutup scanner
        } else if (pilihan == 2) {
            System.out.print("Masukkan jari-jari kerucut: ");
            double jariJari = scanner.nextDouble();
            System.out.print("Masukkan tinggi kerucut: ");
            double tinggi = scanner.nextDouble();
            System.out.print("Masukkan sisi miring kerucut: ");
            double sisiMiring = scanner.nextDouble();

            // Menghitung volume tabung
            double volume = hitungLuasPermukaanKerucut(jariJari, tinggi, sisiMiring);

            // Menampilkan hasil
            System.out.println("Volume kerucut dengan jari-jari " + jariJari +
                    " dan tinggi " + tinggi + "dan sisi miring" + sisiMiring + " adalah: " + volume);

            // Menutup scanner

        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }
        scanner.close();
    }

    // Metode untuk menghitung volume tabung
    public static double hitungVolumeKerucut(double jariJari, double tinggi) {
        double volume = 22 / 7 * Math.pow(jariJari, 2) * tinggi / 3;
        return volume;
    }

    public static double hitungLuasPermukaanKerucut(double jariJari, double tinggi, double sisiMiring) {
        double volume = 22 / 7 * Math.pow(jariJari, 2) + 22 / 7 * jariJari * sisiMiring;
        return volume;
    }
}
