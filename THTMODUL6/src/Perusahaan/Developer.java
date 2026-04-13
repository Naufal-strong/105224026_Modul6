package Perusahaan;

// extends Karyawan berarti Developer mewarisi semua atribut dan fungsi dari Karyawan
public class Developer extends Karyawan {

    private String level;
    private int jumlahBugFix;

    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix) {
        // super() wajib dipanggil pertama untuk menginisialisasi bagian Karyawan
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    public String getLevel() {
         return level; 
        }
    public int getJumlahBugFix() {
         return jumlahBugFix; 
        }

    // @Override menggantikan hitungGajiTotal() milik Karyawan dengan versi Developer
    @Override
    public double hitungGajiTotal() {
        // Ambil hasil gaji dari Karyawan (sudah termasuk bonus loyalitas & penalti)
        double gajiDariParent = super.hitungGajiTotal();

        double tunjanganLevel = 0;
        if (level.equalsIgnoreCase("Senior")) {
            tunjanganLevel = 3_000_000;
        } else if (level.equalsIgnoreCase("Mid")) {
            tunjanganLevel = 1_500_000;
        }
        // Junior tunjanganLevel tetap 0

        double bonusBug = 0;
        // Bonus bug hanya diberikan jika rating >= 3.0, jika tidak bonusBug tetap 0 (hangus)
        if (getRatingKinerja() >= 3.0) {
            bonusBug = jumlahBugFix * 50_000;
        }

        return gajiDariParent + tunjanganLevel + bonusBug;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan  : Developer");
        System.out.println("Level      : " + level);
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix);
    }
}