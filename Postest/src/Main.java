import rental.Kendaraan;
import rental.Mobil;
import rental.Motor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        // Uji coba 1: Mobil LAMA (< 2015), kapasitas > 5
        daftarKendaraan.add(new Mobil("B 1234 WLX", "Toyota Alphard", 2012, 500000, 7));

        // Uji coba 2: Mobil BARU (>= 2015), kapasitas <= 5
        daftarKendaraan.add(new Mobil("D 5678 TON", "Honda Civic", 2020, 400000, 5));

        // Uji coba 3: Motor CC >= 250
        daftarKendaraan.add(new Motor("B 9789 KON", "Kawasaki Ninja", 2021, 150000, 250));

        // Uji coba 4: Motor standar CC < 250
        daftarKendaraan.add(new Motor("B 1111 COP", "Supra X ", 2018, 75000, 110));

        // Looping dengan polimorfisme
        for (Kendaraan k : daftarKendaraan) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: Rp" + k.hitungHargaSewa(5));
            System.out.println();
        }
    }
}