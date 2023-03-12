public class Lemonade extends Drinks{
    
    protected Lemonade(String name, int cost, int quantity, String unit, int volume) {
        super(name, cost, quantity, unit, volume);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Объем: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getUnit(), super.getVolume());
    }
    
}
