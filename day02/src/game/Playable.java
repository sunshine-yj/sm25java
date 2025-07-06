package game;

public class Playable extends Actor {
    public int hunger;
    public String [] inventory = new String[5];

    public Playable() {

    }

    public Playable(String name, int [] location, int health, int weight, String actor_ID, double speed, int hunger, String [] inventory) {
        super(name, location, health, weight, actor_ID, speed);
        this.hunger = hunger;
        this.inventory = inventory;
    }

    public void pickItem() {

    }

    @Override
    public void gone() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void guard() {

    }


}
