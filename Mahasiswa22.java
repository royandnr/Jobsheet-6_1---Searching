public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    // Konstruktor default
    Mahasiswa22() {
    }

    // Konstruktor dengan parameter
    Mahasiswa22(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
