package Zoo;

public abstract class HomeAnimals extends Animals{
    protected HomeAnimals(int height, int weight, String colorEye) {
        super(height, weight, colorEye);
        //TODO Auto-generated constructor stub
    }

    private String name;
    private String breed;
    private String vaccination;
    private String colorCoat;
    private String dateBirthday;


    protected HomeAnimals(String name, String breed, String vaccination, String colorCoat, String dateBirthday, int height, int weight, String colorEye) {
        super(height, weight, colorEye);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.colorCoat = colorCoat;
        this.dateBirthday = dateBirthday;
    }


    @Override
    public String toString() {
        return String.format(
            "Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", 
            this.name, this.breed, this.vaccination, this.colorCoat, this.dateBirthday, super.toString());
    }

    @Override
    public abstract void caressing();

    @Override
    public abstract void animalsSay();

}
