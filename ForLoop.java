public class ForLoop {
    public static void main(String[] args) {
        // Loop for dari 1 hingga 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nilai i: " + i);
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // Pindah ke baris berikutnya setelah setiap baris bintang
        }
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
