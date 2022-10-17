public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
        fighter1.battleRoar();
        int fighter1attackRoll = fighter1.attackRoll();
        System.out.printf("%s attacks and rolls a %d%n", fighter1.name, fighter1attackRoll);

        Fighter fighter2 = new Fighter();
        fighter2.name = "Sozalix";
        fighter2.battleRoar();

        System.out.println(Club.maxDamage);
        // Math.PI is static variable
        System.out.println(Math.PI);
    }
}
