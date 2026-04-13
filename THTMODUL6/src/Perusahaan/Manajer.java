package Perusahaan;

// extends Karyawan berarti Manajer mewarisi semua atribut dan fungsi dari Karyawan
public class Manajer extends Karyawan {

    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        // super() wajib dipanggil pertama untuk menginisialisasi bagian Karyawan
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    public String getDivisi() { 
        return divisi; 
    }
    public int getJumlahAnggotaTim() {
         return jumlahAnggotaTim; 
    }

    // @Override menggantikan hitungGajiTotal() milik Karyawan dengan versi Manajer
    @Override
    public double hitungGajiTotal() {
        // Ambil hasil gaji dari Karyawan (sudah termasuk bonus loyalitas & penalti)
        double gajiDariParent = super.hitungGajiTotal();

        // Tunjangan manajerial: Rp 300.000 per anggota tim
        double tunjanganManajerial = jumlahAnggotaTim * 300_000;

        double totalSementara = gajiDariParent + tunjanganManajerial;

        // Bonus 15% dihitung dari totalSementara (setelah tunjangan), bukan dari gaji pokok
        if (getRatingKinerja() > 4.5) {
            totalSementara = totalSementara * 1.15;
        }

        return totalSementara;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan       : Manajer");
        System.out.println("Divisi        : " + divisi);
        System.out.println("Jumlah Tim    : " + jumlahAnggotaTim + " orang");
    }
}