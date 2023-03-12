package Zoo;
public class Cat extends HomeAnimals {
    private final String wool;
    
    protected Cat(String name, String breed, String vaccination, String color, String dateBirthday, int height,
            int weight, String colorEye, String wool) {
        super(name, breed, vaccination, color, dateBirthday, height, weight, colorEye);
        this.wool = wool;

    }

    @Override
    public void caressing() {
        System.out.println("Проявлять ласку");
        
    }

    @Override
    public void animalsSay() {
        System.out.println("Мяу");
        
    }

    @Override
    public String toString() {
        return String.format(
            "Кот; %s; Наличие шерсти: %s;", 
            super.toString(), this.wool);
    }
    
}
