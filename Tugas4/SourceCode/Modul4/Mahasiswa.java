// Nama  : Mushab Al Mubarak
// Nim	 : 13020220049
// Kelas : A2
// Hari/Tanggal : Selasa/26-03-2024
// Waktu Pengerjaan : 5 menit

public class Mahasiswa extends Orang {
    private String stb;
    public Mahasiswa() {
        super();
        this.stb = "1302002134";
    }
    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }
    public static void info() {
        System.out.println("Class Mahasiswa");
    }
}