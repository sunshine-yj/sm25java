package game;

public abstract class Actor extends ObjectInGame {
    public String actor_ID;
    public double speed;

    public Actor() {

    }

    public Actor(String name, int [] location, int health, int weight, String actor_ID, double speed) {
        super(name, location, health, weight);
        this.actor_ID = actor_ID;
        this.speed = speed;
    }

    public abstract void walk();
    public abstract void stop();
    public abstract void attack();
    public abstract void guard();

}
