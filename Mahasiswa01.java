public class Mahasiswa01 {
  String nim;
  String nama;
  String kelas;
  double ipk;

  void tampilkanInfo() {
    System.out.println("Nama: " + nama);
    System.out.println("NIM: " + nim);
    System.out.println("IPK: " + ipk);
    System.out.println("Kelas: " + kelas);
  }

  void ubahKelas(String kelasBaru) {
    kelas = kelasBaru;
  }

  void updateIPK(double ipkBaru) {
    if (ipkBaru <= 0.0 || ipkBaru >= 4.0) {
      System.out.println("IPK tidak valid");
      return;
    }

    ipk = ipkBaru;
  }

  String nilaiKinerja(double ipk) {
    if (ipk >= 3.5) {
      return "Kinerja Sangat Baik";
    } else if (ipk >= 3.0) {
      return "Kinerja Baik";
    } else if (ipk >= 2.0) {
      return "Kinerja Cukup";
    } else {
      return "Kinerja Kurang";
    }
  }
}