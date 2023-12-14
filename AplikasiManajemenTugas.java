import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String nama;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tambahJumlah(int jumlahTambah) {
        this.jumlah += jumlahTambah;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nama='" + nama + '\'' +
                ", jumlah=" + jumlah +
                '}';
    }
}

class TaskManager {
    private ArrayList<Item> daftarItem;

    public TaskManager() {
        this.daftarItem = new ArrayList<>();
    }

    public void tambahItem(String nama, int jumlah) {
        boolean itemDitemukan = false;

        for (Item item : daftarItem) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                item.tambahJumlah(jumlah);
                itemDitemukan = true;
                System.out.println("Jumlah item " + nama + " telah diupdate: " + item);
                break;
            }
        }

        if (!itemDitemukan) {
            Item newItem = new Item(nama, jumlah);
            daftarItem.add(newItem);
            System.out.println("Item baru ditambahkan: " + newItem);
        }
    }

    public void tampilkanDaftar() {
        System.out.println("Daftar Item:");
        for (Item item : daftarItem) {
            System.out.println(item);
        }
    }
}

public class AplikasiManajemenTugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.println("===== Aplikasi Manajemen Tugas =====");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Daftar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membuang karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String namaItem = scanner.nextLine();
                    System.out.print("Masukkan jumlah item: ");
                    int jumlahItem = scanner.nextInt();
                    taskManager.tambahItem(namaItem, jumlahItem);
                    break;
                case 2:
                    taskManager.tampilkanDaftar();
                    break;
                case 3:
                    isSelesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }

        System.out.println("Terima kasih telah menggunakan Aplikasi Manajemen Tugas.");
        scanner.close();
    }
}
