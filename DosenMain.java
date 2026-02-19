public class DosenMain {
  public static void main(String[] args) {
    // Objek 1 menggunakan konstruktor default [5]
    Dosen dsn1 = new Dosen();
    dsn1.idDosen = "D001";
    dsn1.nama = "Dr. Andi Wijaya";
    dsn1.statusAktif = true;
    dsn1.tahunBergabung = 2015;
    dsn1.bidangKeahlian = "Kecerdasan Buatan";

    // Objek 2 menggunakan konstruktor berparameter [5]
    Dosen dsn2 = new Dosen("D002", "Siti Aminah, M.T.", false, 2018, "Sistem Jaringan");

    // Memanggil method untuk objek 1
    System.out.println("--- Informasi Dosen 1 ---");
    dsn1.tampilInformasi();
    System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
    dsn1.ubahKeahlian("Data Science");
    dsn1.tampilInformasi();

    System.out.println("\n--- Informasi Dosen 2 ---");
    dsn2.tampilInformasi();
    dsn2.setStatusAktif(true);
    System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
  }
}