public class MataKuliahMain {
  public static void main(String[] args) {
    // Objek 1 menggunakan konstruktor default [2]
    MataKuliah mk1 = new MataKuliah();
    mk1.kodeMK = "ALSD";
    mk1.nama = "Algoritma dan Struktur Data";
    mk1.sks = 3;
    mk1.jumlahJam = 6;

    // Objek 2 menggunakan konstruktor berparameter [2]
    MataKuliah mk2 = new MataKuliah("BASDAT", "Basis Data", 2, 4);

    // Memanggil method untuk objek 1
    System.out.println("--- Informasi Mata Kuliah 1 ---");
    mk1.tampilInformasi();
    mk1.ubahSKS(4);
    mk1.tambahJam(2);
    mk1.kurangiJam(1);
    mk1.tampilInformasi();

    System.out.println("\n--- Informasi Mata Kuliah 2 ---");
    mk2.tampilInformasi();
    mk2.kurangiJam(10); // Contoh jika jam tidak mencukupi
  }
}