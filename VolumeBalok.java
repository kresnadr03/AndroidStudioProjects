import java.util.Scanner;

public class VolumeBalok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda ingin menghitung (1) Volume atau (2) Luas Permukaan balok? ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Menghitung volume balok
            System.out.print("Masukkan panjang balok: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar balok: ");
            double lebar = scanner.nextDouble();

            System.out.print("Masukkan tinggi balok: ");
            double tinggi = scanner.nextDouble();

            double volume = hitungVolumeBalok(panjang, lebar, tinggi);
            System.out.println("Volume balok adalah: " + volume);
        } else if (pilihan == 2) {
            // Menghitung luas permukaan balok
            System.out.print("Masukkan panjang balok: ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan lebar balok: ");
            double lebar = scanner.nextDouble();

            System.out.print("Masukkan tinggi balok: ");
            double tinggi = scanner.nextDouble();

            double luasPermukaan = hitungLuasPermukaanBalok(panjang, lebar, tinggi);
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }

        scanner.close();
    }

    // Metode untuk menghitung volume balok
    public static double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Metode untuk menghitung luas permukaan balok
    public static double hitungLuasPermukaanBalok(double panjang, double lebar, double tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
