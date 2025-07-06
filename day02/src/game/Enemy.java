package game;

public class Enemy extends Actor {

    public String loot;

    public Enemy () {

    }

    public Enemy (String name, int [] location, int health, int weight, String actor_ID, double speed,  String loot) {
        super(name, location, health, weight, actor_ID, speed);
        this.loot = loot;
    }

    public void dropLoot() {

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

    @Override
    public void gone() {

    }
}
