public class HygieneItems extends Products {
    protected static int amount;

    protected HygieneItems(String name, int cost, int quantity, String unit, int amount2) {
        super(name, cost, quantity, unit);
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
}