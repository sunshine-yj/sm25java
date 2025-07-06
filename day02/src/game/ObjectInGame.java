package game;

public abstract class ObjectInGame {
    public String name;
    public int [] location = new int[2];
    public int health;
    public int weight;

    public ObjectInGame() {

    }

    public ObjectInGame(String name, int [] location, int health, int weight) {
        this.name = name;
        this.location = location;
        this.health = health;
        this.weight = weight;
    }

    public abstract void gone();

}
