public class Drinks extends Products {
    protected static int volume;
    
    protected Drinks(String name, int cost, int quantity, String unit, int volume2) {
        super(name, cost, quantity, unit);
        this.volume = volume;
    }
    
    public int getVolume() {
        return volume;
    }
}