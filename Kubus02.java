import java.util.Scanner;

public class Kubus02{
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input02.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input02.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];
        inputNilai(nilai, mahasiswa);
        showNilai(nilai, mahasiswa);
        int mingguTertinggi = cariMingguNilaiTertinggi(nilai);
        System.out.println("Minggu dengan nilai tertinggi adalah " + mingguTertinggi);
        tampilkanMahasiswaNilaiTertinggi(nilai, mahasiswa, mingguTertinggi);
    }

    public static void inputNilai(int[][] nilai, String[] mahasiswa) {
        Scanner input02 = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai tugas mahasiswa " + mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilai[i][j] = input02.nextInt();
            }
            System.out.println();
        }
    }

    public static void showNilai(int[][] nilai, String[] mahasiswa) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai tugas " + mahasiswa[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Minggu ke-" + (j + 1) + ": " + nilai[i][j]);
            }
            System.out.println();
        }
    }

    public static int cariMingguNilaiTertinggi(int[][] nilai) {
        int mingguTertinggi = 1;
        int nilaiTertinggi = nilai[0][0];

        for (int j = 0; j < nilai[0].length; j++) {
            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguTertinggi = j + 1;
                }
            }
        }

        return mingguTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTertinggi(int[][] nilai, String[] mahasiswa, int mingguTertinggi) {
        int nilaiTertinggi = nilai[0][mingguTertinggi - 1];
        String mahasiswaNilaiTertinggi = mahasiswa[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i][mingguTertinggi - 1] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i][mingguTertinggi - 1];
                mahasiswaNilaiTertinggi = mahasiswa[i];
            }
        }

        System.out.println("Mahasiswa yang memiliki nilai tertinggi pada minggu ke-" + mingguTertinggi + " adalah " + mahasiswaNilaiTertinggi + " memiliki nilai " + nilaiTertinggi);
    }
}
