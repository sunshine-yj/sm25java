package game;

public abstract class Item extends ObjectInGame {
    public String dropTime;
    public int quantity;
    public int values;
    public String effect;

    public Item() {

    }

    public Item(String name, int [] location, int health, int weight, String dropTime, int quantity, int values, String effect) {
        super(name, location, health, weight);
        this.dropTime = dropTime;
        this.quantity = quantity;
        this.values = values;
        this.effect = effect;
    }

    public abstract void using();
}
