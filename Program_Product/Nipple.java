public class Nipple extends BabyProducts {

    protected Nipple(String name, int cost, int quantity, String unit, int minAge, String hypoallergenic) {
        super(name, cost, quantity, unit, hypoallergenic);
    }
    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %d; Количество: %d; Еденица измерения: %s; Мин. возраст: %d; Гипоаллергенность: %s;", 
        super.getName(), super.getCost(), super.getQuantity(), super.getUnit(), super.getMinAge(), getHypoallergenic());
    }
    
}