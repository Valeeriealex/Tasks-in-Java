// Все объекты товаров и проверить работу метода, созданного в классе Program
public class Products {
    private String name;
    private int cost;
    private int quantity;
    private String unit;

    protected Products(String name, int cost, int quantity, String unit){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return String.format("Название: %s; Цена: %d; Количество: %d; Еденица измерения: %s;", this.name,
        this.cost, this.quantity, this.unit);
    }
}
