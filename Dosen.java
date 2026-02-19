public class Dosen {
  // Atribut [6]
  String idDosen;
  String nama;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;

  // Konstruktor Default [5]
  public Dosen() {
  }

  // Konstruktor Berparameter [5]
  public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
  }

  // Method tampilkanInformasi [7]
  void tampilInformasi() {
    System.out.println("ID Dosen        : " + idDosen);
    System.out.println("Nama            : " + nama);
    System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    System.out.println("Tahun Bergabung : " + tahunBergabung);
    System.out.println("Bidang Keahlian : " + bidangKeahlian);
  }

  // Method setStatusAktif [7]
  void setStatusAktif(boolean status) {
    this.statusAktif = status;
    System.out.println("Status aktif dosen telah diperbarui.");
  }

  // Method hitungMasaKerja [7, 8]
  int hitungMasaKerja(int thnSkrg) {
    return thnSkrg - tahunBergabung;
  }

  // Method ubahKeahlian [8]
  void ubahKeahlian(String bidang) {
    this.bidangKeahlian = bidang;
    System.out.println("Bidang keahlian telah diubah.");
  }
}