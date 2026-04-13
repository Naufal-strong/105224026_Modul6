package Perusahaan;

public class Karyawan {

    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;

        // Jika rating di luar rentang 1.0-5.0, paksa set ke default 3.0
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        } else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    public String getIdKaryawan() {
         return idKaryawan;
    }
    public String getNama() { 
         return nama;
    }
    public int getTahunMasuk() { 
        return tahunMasuk; 
    }
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    public double getRatingKinerja() { 
        return ratingKinerja; 
    }

    public void setGajiPokok(double gajiPokok) {
         this.gajiPokok = gajiPokok;
         }
    public void setRatingKinerja(double ratingKinerja) {
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0) {
            this.ratingKinerja = ratingKinerja;
        }
    }

    public double hitungGajiTotal() {
        int masaKerja = 2026 - tahunMasuk;// masa kerjanya dihitung dari tahun masuk sampai tahun 2026

        // Bonus loyalitas: 5% dari gaji pokok per tahun masa kerja
        double bonusLoyalitas = gajiPokok * 0.05 * masaKerja;

        double totalSementara = gajiPokok + bonusLoyalitas;

        // Jika rating < 2.5, total dipotong 10% sebagai penalti kinerja
        if (ratingKinerja < 2.5) {
            totalSementara = totalSementara * 0.90;
        }

        return totalSementara;
    }

    public void displayInfo() {
        System.out.println("ID Karyawan  : " + idKaryawan);
        System.out.println("Nama         : " + nama);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Rating Kinerja: " + ratingKinerja);
        System.out.printf("Gaji Pokok  : Rp %.0f%n", gajiPokok);
    }
}