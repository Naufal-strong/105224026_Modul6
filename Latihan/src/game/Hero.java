package game;

public class Hero {
    String nama;
    double health;
    double attackPower;


    public Hero(String nama, double health, double attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    public void berlatih (){
        attackPower += 10;
        System.out.println(nama + " lagi berlatih, Attack Power meningkat menjadi " + attackPower);
    }
    public void terimaSerangan(double damage) {
        health -= damage;
        System.out.println(nama + " menerima serangan sebesar " + damage + ", Health sekarang: " + health);
    }
}
