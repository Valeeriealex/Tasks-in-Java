public class Eggs extends Food {
    private int packages;
    protected Eggs(String name, int cost, int quantity, String unit, String date, int packages) {
        super(name, cost, quantity, unit, date);
        this.packages = packages;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Количество в уп.: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getUnit(), super.getDate(), this.packages);
    }
    
}