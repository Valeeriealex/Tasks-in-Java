public class Food extends Products {
    private String date;

    protected Food(String name, int cost, int quantity, String unit, String date) {
        super(name, cost, quantity, unit);
        this.date = date;
    }
    
    public String getDate() {
        return date;
    }
}