package game;

public class Animal extends Actor{
    public String food;

    public Animal() {

    }

    public Animal(String name, int [] location, int health, int weight, String actor_ID, double speed, String food) {
        super(name, location, health, weight, actor_ID, speed);
        this.food = food;
    }

    public void yieldFood() {

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
