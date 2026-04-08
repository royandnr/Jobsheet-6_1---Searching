import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        // INPUT
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-------------------");

            list.tambah(new Mahasiswa22(nim, nama, kelas, ipk));
        }

        // TAMPIL
        list.tampil();

        // SEARCH
        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------");
        System.out.println("Masukkan ipk mahasiswa yang ingin dicari : ");
        System.out.println("IPK : ");
        String input = sc.nextLine();
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = list.sequentialSearching(cari); // FIX
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data binary
        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------");
        System.out.println("Masukkan ipk mahasiswa yang ingin dicari : ");
        System.out.println("IPK : ");
        double cari2 = sc.nextDouble();
        System.out.println("----------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("----------------------------");
        double posisi2 = list.FindBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2; // FIX
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);


        // TAMBAH DATA LAGI (SESUAI KODE ASLI KAMU)
        Mahasiswa22 m1 = new Mahasiswa22("123", "Zidan", "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu",   "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("125", "Sofi",  "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("126", "Sita",  "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Miki",  "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}