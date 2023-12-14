import java.util.Scanner;

public class Keluarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inginInputLagi = true;

        while (inginInputLagi) {
            System.out.print("Masukkan nama orang pertama: ");
            String orang1 = scanner.nextLine();

            System.out.print("Masukkan nama orang kedua: ");
            String orang2 = scanner.nextLine();

            // Menampilkan hubungan keluarga berdasarkan input nama
            if (orang1.equalsIgnoreCase("A") && orang2.equalsIgnoreCase("B")) {
                System.out.println("A adalah suami B");
            } else if (orang1.equalsIgnoreCase("B") && orang2.equalsIgnoreCase("A")) {
                System.out.println("B adalah istri A");
            } else if (orang1.equalsIgnoreCase("A") && orang2.equalsIgnoreCase("C")) {
                System.out.println("A adalah ayah C");
            } else if (orang1.equalsIgnoreCase("C") && orang2.equalsIgnoreCase("A")) {
                System.out.println("C adalah anak A");
            } else if (orang1.equalsIgnoreCase("B") && orang2.equalsIgnoreCase("C")) {
                System.out.println("B adalah ibu C");
            } else if (orang1.equalsIgnoreCase("C") && orang2.equalsIgnoreCase("B")) {
                System.out.println("C adalah anak B");
            } else if (orang1.equalsIgnoreCase("D") && orang2.equalsIgnoreCase("C")) {
                System.out.println("D adalah adik C");
            } else if (orang1.equalsIgnoreCase("C") && orang2.equalsIgnoreCase("D")) {
                System.out.println("C adalah kakak D");
            } else if (orang1.equalsIgnoreCase("A") && orang2.equalsIgnoreCase("D")) {
                System.out.println("A adalah ayah D");
            } else if (orang1.equalsIgnoreCase("D") && orang2.equalsIgnoreCase("A")) {
                System.out.println("D adalah anak A");
            } else if (orang1.equalsIgnoreCase("B") && orang2.equalsIgnoreCase("D")) {
                System.out.println("B adalah ibu D");
            } else if (orang1.equalsIgnoreCase("D") && orang2.equalsIgnoreCase("B")) {
                System.out.println("D adalah anak B");
            } else {
                System.out.println("Hubungan keluarga tidak terdefinisi atau tidak sesuai.");
            }
            System.out.print("Apakah Anda ingin menginput lagi? (ya/tidak): ");
            String jawaban = scanner.nextLine();

            if (!jawaban.equalsIgnoreCase("ya")) {
                inginInputLagi = false;
            }
            
        }
        System.out.println("Terima kasih telah menggunakan program Hubungan Keluarga.");

            scanner.close();
    }
}
