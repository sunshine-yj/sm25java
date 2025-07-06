package game;

public class Ediable extends Item {
    public int gainHunger;

    public Ediable () {

    }

    public Ediable (String name, int [] location, int health, int weight, String dropTime, int quantity, int values, String effect, int gainHunger) {
        super(name, location, health, weight, dropTime, quantity, values, effect);
        this.gainHunger = gainHunger;
    }

    @Override
    public void gone() {

    }

    @Override
    public void using() {

    }

}
