package game;

public class HeroStrength extends Hero {
    String Tipe = "Strength";
    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        System.out.println("Tipe Hero: " + Tipe);
        super.display();
    }
    
    @Override
    public void terimaSerangan(double damage) {
        double DamageAktual = damage * 0.5; // Mengurangi damage sebesar 20%
        System.out.println(nama + "(Strength) Memiliki Pertahanan yang bagus izinnnnnn!" );
        super.terimaSerangan(DamageAktual);
    }
}
