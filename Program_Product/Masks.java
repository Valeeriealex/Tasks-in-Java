public class Masks extends HygieneItems {

    protected Masks(String name, int cost, int quantity, String unit, int size) {
        super(name, cost, quantity, unit, amount);
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в уп.: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getUnit(), super.getAmount());
    }
    
}
