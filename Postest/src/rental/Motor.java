package rental;

public class Motor extends Kendaraan {
    public int kapasitasMesin;
    public Motor(String nomorPolisi, String merk, int tahunProduksi,
                 double hargaSewaDasar, int kapasitasMesin) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe     : Motor");
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " CC ");
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double total = super.hitungHargaSewa(hari); // harga dasar + diskon jika lama
        if (kapasitasMesin >= 250) {
            total += 25000 * hari;                  // pajak barang mewah per hari
        }
        return total;
    }
}