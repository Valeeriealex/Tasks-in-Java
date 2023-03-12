package Zoo;

public abstract class Animals {
    private int height;
    private int weight;
    private String colorEye;

    protected Animals(int height, int weight, String colorEye) {
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }

    public abstract void animalsSay();

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", this.height, this.weight, this.colorEye);
    }

    
}