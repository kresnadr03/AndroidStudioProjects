import java.util.Scanner;

public class TicTacToe {
    private char[][] papanPermainan;
    private char pemainSekarang;

    public TicTacToe() {
        papanPermainan = new char[3][3];
        pemainSekarang = 'X';
        inisialisasiPapan();
    }

    private void inisialisasiPapan() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                papanPermainan[i][j] = '-';
            }
        }
    }

    private void tampilkanPapan() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(papanPermainan[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean cekPemenang() {
        // Cek baris dan kolom
        for (int i = 0; i < 3; i++) {
            if ((papanPermainan[i][0] == pemainSekarang && papanPermainan[i][1] == pemainSekarang && papanPermainan[i][2] == pemainSekarang) ||
                (papanPermainan[0][i] == pemainSekarang && papanPermainan[1][i] == pemainSekarang && papanPermainan[2][i] == pemainSekarang)) {
                return true;
            }
        }

        // Cek diagonal
        if ((papanPermainan[0][0] == pemainSekarang && papanPermainan[1][1] == pemainSekarang && papanPermainan[2][2] == pemainSekarang) ||
            (papanPermainan[0][2] == pemainSekarang && papanPermainan[1][1] == pemainSekarang && papanPermainan[2][0] == pemainSekarang)) {
            return true;
        }

        return false;
    }

    private boolean cekIsiPapan() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (papanPermainan[i][j] == '-') {
                    return false; // Papan masih ada yang kosong
                }
            }
        }
        return true; // Semua sel penuh
    }

    private void gantiPemain() {
        pemainSekarang = (pemainSekarang == 'X') ? 'O' : 'X';
    }

    public void mulaiPermainan() {
        Scanner scanner = new Scanner(System.in);
        boolean gameSelesai = false;

        while (!gameSelesai) {
            tampilkanPapan();
            int baris, kolom;

            do {
                System.out.println("Pemain " + pemainSekarang + ", masukkan baris (0-2) dan kolom (0-2) dipisahkan spasi:");
                baris = scanner.nextInt();
                kolom = scanner.nextInt();
            } while (baris < 0 || baris >= 3 || kolom < 0 || kolom >= 3 || papanPermainan[baris][kolom] != '-');

            papanPermainan[baris][kolom] = pemainSekarang;

            if (cekPemenang()) {
                tampilkanPapan();
                System.out.println("Pemain " + pemainSekarang + " menang!");
                gameSelesai = true;
            } else if (cekIsiPapan()) {
                tampilkanPapan();
                System.out.println("Permainan seri!");
                gameSelesai = true;
            } else {
                gantiPemain();
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe permainanTicTacToe = new TicTacToe();
        permainanTicTacToe.mulaiPermainan();
    }
}
