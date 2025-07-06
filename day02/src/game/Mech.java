package game;

public class Mech extends Actor {
    public double power;

    public Mech() {

    }

    public Mech(String name, int [] location, int health, int weight, String actor_ID, double speed, double power) {
        super(name, location, health, weight, actor_ID, speed);
        this.power = power;
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

    public void work () {

    }
}
