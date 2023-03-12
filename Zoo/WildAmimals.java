package Zoo;

public abstract class WildAmimals extends Animals{
    private String place;
    private String date;

    protected WildAmimals(int height, int weight, String colorEye, String place, String date) {
        super(height, weight, colorEye);
        this.place = place;
        this.date = date;
    }
    
    @Override
    public abstract void animalsSay();

    @Override
    public String toString() {
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s", 
        this.place, this.date, super.toString());
    }
}