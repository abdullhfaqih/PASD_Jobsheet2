public class MataKuliah {
  // Atribut [2]
  String kodeMK;
  String nama;
  int sks;
  int jumlahJam;

  // Konstruktor Default [2]
  public MataKuliah() {
  }

  // Konstruktor Berparameter [2]
  public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  // Method tampilkanInformasi [3]
  void tampilInformasi() {
    System.out.println("Kode MK    : " + kodeMK);
    System.out.println("Nama       : " + nama);
    System.out.println("SKS        : " + sks);
    System.out.println("Jumlah Jam : " + jumlahJam);
  }

  // Method ubahSKS [3]
  void ubahSKS(int sksBaru) {
    this.sks = sksBaru;
    System.out.println("SKS telah diubah menjadi: " + sks);
  }

  // Method tambahJam [3]
  void tambahJam(int jam) {
    this.jumlahJam += jam;
    System.out.println("Jumlah jam berhasil ditambah.");
  }

  // Method kurangiJam [4]
  void kurangiJam(int jam) {
    if (this.jumlahJam >= jam) {
      this.jumlahJam -= jam;
      System.out.println("Pengurangan berhasil. Jumlah jam baru: " + jumlahJam);
    } else {
      System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
    }
  }
}