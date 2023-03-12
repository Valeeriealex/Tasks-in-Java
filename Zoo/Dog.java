package Zoo;

public class Dog extends HomeAnimals {
    private final String training;

    protected Dog(String name, String breed, String vaccination, String color, String dateBirthday, int height,
            int weight, String colorEye, String training) {
        super(name, breed, vaccination, color, dateBirthday, height, weight, colorEye);
        this.training = training;

    }

    @Override
    public void animalsSay() {
        System.out.println("Гав");

    }

    public void doTraining(){
        System.out.println("Дрессировка");
    }

    @Override
    public String toString() {
        return String.format("Собака; %s; Дресировка: %s", super.toString(), this.training);
       }

    @Override
    public void caressing() {
        System.out.println("Проявлять ласку");
    }
}