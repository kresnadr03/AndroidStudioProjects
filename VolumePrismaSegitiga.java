import java.util.Scanner;

public class VolumePrismaSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah Anda ingin menghitung (1) Volume atau (2) Luas Permukaan prisma? ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Menghitung volume balok
            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            System.out.print("Masukkan tinggi prisma: ");
            double Tinggi = scanner.nextDouble();

            double volume = hitungVolumePrisma(alas, tinggi, Tinggi);
            System.out.println("Volume prisma adalah: " + volume);
        } else if (pilihan == 2) {
            // Menghitung luas permukaan balok
            System.out.print("Masukkan sisi segitiga: ");
            double sisi1 = scanner.nextDouble();

            System.out.print("Masukkan sisi segitiga: ");
            double sisi2 = scanner.nextDouble();

            System.out.print("Masukkan sisi segitiga: ");
            double sisi3 = scanner.nextDouble();

            System.out.print("Masukkan alas segitiga: ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = scanner.nextDouble();

            System.out.print("Masukkan tinggi prisma: ");
            double Tinggi = scanner.nextDouble();

            double luasPermukaan = hitungLuasPermukaanPrisma(sisi1, sisi2, sisi3, alas, tinggi, Tinggi);
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }

        scanner.close();
    }

    // Metode untuk menghitung volume balok
    public static double hitungVolumePrisma(double alas, double Tinggi, double tinggi) {
        return 1/2 * alas * tinggi * Tinggi;
    }

    // Metode untuk menghitung luas permukaan balok
    public static double hitungLuasPermukaanPrisma(double sisi1, double sisi2, double sisi3, double alas, double Tinggi, double tinggi) {
        return alas * tinggi + (sisi1 + sisi2 + sisi3) * Tinggi;
    }
}
