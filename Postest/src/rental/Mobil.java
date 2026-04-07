package rental;

public class Mobil extends Kendaraan {
    public int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi,
                 double hargaSewaDasar, int kapasitasPenumpang) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe     : Mobil");
        System.out.println("Kap. Penumpang  : " + kapasitasPenumpang + " orang");
    }
    @Override
    public double hitungHargaSewa(int hari) {
        double total = super.hitungHargaSewa(hari); // harga dasar + diskon jika lama
        total += 50000 * hari;                      // asuransi wajib per hari
        if (kapasitasPenumpang > 5) {
            total += 50000;                         // biaya kebersihan flat (sekali bayar)
        }
        return total;
    }
}