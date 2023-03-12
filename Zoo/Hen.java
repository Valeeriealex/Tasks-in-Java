package Zoo;

public class Hen extends Bird implements BirdFly{


    protected Hen(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах", super.getHightFly());
        
    }

    @Override
    public void animalsSay() {
        System.out.println("Кудахт");
    }

    @Override
    public String toString() {
        return String.format("Курица; %s", super.toString());
    }
    
}
