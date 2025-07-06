package game;

public class Weapon extends Item{
    public int attackDamage;

    public Weapon () {

    }

    public Weapon (String name, int [] location, int health, int weight, String dropTime, int quantity, int values, String effect, int attackDamage) {
        super(name, location, health, weight, dropTime, quantity, values, effect);
        this.dropTime = dropTime;
    }

    @Override
    public void gone() {

    }

    @Override
    public void using() {

    }

}
