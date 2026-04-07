
package game;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Levi Ackerman", 150.0, 75.0);
        HeroStrength hero2 = new HeroStrength("Titan", 200.0, 100.0);

        hero1.display();
        System.out.println();
        hero2.display();
        System.out.println();

        hero1.berlatih();
        hero2.berlatih();
        System.out.println();

        System.out.println(" Kedua hero diserang dengan damage 40 ");
        hero1.terimaSerangan(40);
        hero2.terimaSerangan(40);
        System.out.println();

        System.out.println("= Status Akhir =");
        hero1.display();
        System.out.println();
        hero2.display();
    }
}