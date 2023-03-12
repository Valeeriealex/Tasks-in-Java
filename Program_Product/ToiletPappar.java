public class ToiletPappar extends HygieneItems {
    private int layers;
    protected ToiletPappar(String name, int cost, int quantity, String unit, int size, int layers) {
        super(name, cost, quantity, unit,amount);
        this.layers = layers;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Количество в уп.: %d; Кол. слоев: %d", 
        super.getName(), super.getCost(), super.getQuantity(), super.getUnit(), super.getAmount(), this.layers);
    }
    
}
