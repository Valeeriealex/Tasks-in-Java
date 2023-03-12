public class Bread extends Food {
    private String type;
    protected Bread(String name, int cost, int quantity, String unit, String date, String type) {
        super(name, cost, quantity, unit, date);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Тип муки: %s;", super.getName(),
        super.getCost(), super.getQuantity(), super.getUnit(), super.getDate(), this.type);
    }
    
}
