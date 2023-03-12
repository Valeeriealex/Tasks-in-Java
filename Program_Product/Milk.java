public class Milk extends Drinks{

    private int fat;
    private String date;

    protected Milk(String name, int cost, int quantity, String unit, String date, int fat) {
        super(name, cost, quantity, unit, volume);
        this.fat = fat;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Срок годности: %s; Процент жирности: %d;", super.getName(),
        super.getCost(), super.getQuantity(), super.getUnit(), super.getVolume(), this.date, this.fat);
    }
    
}