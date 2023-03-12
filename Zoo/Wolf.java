package Zoo;

public class Wolf extends WildAmimals{
    
    private final String leader;
    
    protected Wolf(int height, int weight, String colorEye, String place, String date, String leader) {
        super(height, weight, colorEye, place, date);
        
        this.leader = leader;

    }

    @Override
    public void animalsSay() {
        System.out.println("Аууу");        
    }

    @Override
    public String toString() {
        return String.format("Волк; %s; Вожак стаи: %s", super.toString(), this.leader);
       }
    
}