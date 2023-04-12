package toys;


public abstract class Toy {
    private int toyId;
    private String name;
    private int weight;

    public Toy(int toyId, String name, int weight) {
        this.toyId = toyId;
        this.name = name;
        this.weight = weight;
    }

    public Toy() {
    }

    @Override
    public String toString() {
        return "Toy id - " + toyId +
                ", name - " + name +
                ", weight - " + weight + '\n';
    }
}
