import java.util.Scanner;

class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Tukar elemen arr[j] dengan arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class BubbleSortApp {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            // Meminta pengguna untuk memasukkan jumlah data
            System.out.print("Masukkan jumlah data: ");
            int n = scanner.nextInt();
            
            // Meminta pengguna untuk memasukkan data
            int[] arr = new int[n];
            System.out.println("Masukkan data:");
            for (int i = 0; i < n; i++) {
                System.out.print("Data ke-" + (i+1) + ": ");
                arr[i] = scanner.nextInt();
            }
            
            // Memanggil method sort dari class BubbleSort
            BubbleSort.sort(arr);
            
            // Mencetak hasil pengurutan
            System.out.println("Hasil setelah diurutkan:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan. Pastikan masukan Anda valid.");
        }
    }
}
