public class Skeleton extends Boss {
private int arrows;

    public Skeleton(String name, int health, int damage, Weapon weapon, int arrow) {
        super(name, health, damage, weapon);
        this.arrows = arrow;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Arrows: " + arrows);
    }
}
