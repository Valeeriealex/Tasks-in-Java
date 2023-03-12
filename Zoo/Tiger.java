package Zoo;

public class Tiger extends WildAmimals {

    protected Tiger(int height, int weight, String colorEye, String place, String date) {
        super(height, weight, colorEye, place, date);
    }

    @Override
    public void animalsSay() {
        System.out.println("Рррр");
        
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
       }
    
}
