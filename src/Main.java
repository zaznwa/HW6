public class Main {
    public static void main(String[] args) {

    Weapon sword = new Weapon(WeaponType.BLADED_WEAPON, "Sword");
    Boss boss = new Boss("Troll", 1000, 200,sword);

    Weapon bow = new Weapon(WeaponType.LASER_WEAPON,"Bow");
    Skeleton skeleton1 = new Skeleton("Skull",200,10,bow,50);
    Skeleton skeleton2 = new Skeleton("Bone",200,10,bow,60);

    boss.printInfo();
    skeleton1.printInfo();
    skeleton2.printInfo();


    }
}
