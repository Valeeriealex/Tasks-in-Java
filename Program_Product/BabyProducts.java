public class BabyProducts extends Products {
    private String date;

    private int minAge;
    private String hypoallergenic;

    protected BabyProducts (String name, int cost, int quantity, String unit, String date) {
        super(name, cost, quantity, unit);

        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
    
    public int getMinAge() {
        return minAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }
}