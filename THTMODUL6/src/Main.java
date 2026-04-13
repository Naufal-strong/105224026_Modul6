import Perusahaan.Karyawan;
import Perusahaan.Developer;
import Perusahaan.Manajer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList bertipe Karyawan bisa menampung Developer & Manajer
        // karena keduanya adalah turunan dari Karyawan (polimorfisme)
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

        daftarKaryawan.add(new Karyawan("K012", "Toni Saputra", 2020, 5_000_000, 2.0));       // rating 2.0 -> kena penalti
        daftarKaryawan.add(new Developer("K024", "Ucup Samudra", 2018, 7_000_000, 4.0, "Senior", 20)); // bonus bug aktif
        daftarKaryawan.add(new Developer("K042", "Citra Cita", 2024, 6_000_000, 2.8, "Mid", 15));     // bonus bug hangus
        daftarKaryawan.add(new Manajer("K099", "Sarnadi Henuya", 2015, 9_000_000, 4.8, "IT", 10));      // bonus ekstra 15%
        daftarKaryawan.add(new Manajer("K014", "Eka Sianturi", 2025, 8_000_000, 3.5, "HR", 3));          // tunjangan biasa

        double totalAnggaranGaji = 0;
        double gajiTertinggi = 0;
        String namaHighestEarner = "";
        double totalRating = 0;

        for (Karyawan k : daftarKaryawan) {
            // Java otomatis memanggil displayInfo() sesuai tipe objek aslinya
            k.displayInfo();

            double gajiTotal = k.hitungGajiTotal();
            System.out.printf("Total Gaji Bulan Ini: Rp %.0f%n", gajiTotal);

            totalAnggaranGaji += gajiTotal;

            // Update highest earner jika gaji karyawan ini lebih tinggi dari sebelumnya
            if (gajiTotal > gajiTertinggi) {
                gajiTertinggi = gajiTotal;
                namaHighestEarner = k.getNama();
            }

            totalRating += k.getRatingKinerja();
        }

        // Rata-rata rating: total rating dibagi jumlah karyawan
        double rataRataRating = totalRating / daftarKaryawan.size();

        System.out.println("\n RINGKASAN PERUSAHAAN ");
        System.out.printf("Total Anggaran Gaji : Rp %.0f%n", totalAnggaranGaji);
        System.out.println("Highest Earner      : " + namaHighestEarner);
        System.out.printf("Gaji Tertinggi  : Rp %.0f%n", gajiTertinggi);
        System.out.printf("Rata-rata Rating : %.2f%n", rataRataRating);
    }
}