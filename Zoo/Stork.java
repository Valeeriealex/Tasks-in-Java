package Zoo;

public class Stork extends Bird implements BirdFly{

    protected Stork(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getHightFly());

        
    }

    @Override
    public void animalsSay() {
        System.out.println("Кря");
        
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
    
}
