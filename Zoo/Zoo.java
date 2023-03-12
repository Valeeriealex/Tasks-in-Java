package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animals> allAnimal = new ArrayList<>();
    {
    allAnimals.add(new Cat("Кот", "Порода", "Да", "Цвет шерсти", "Дата рождения", 25, 7, "Цвет глаз", "да"));
    allAnimals.add(new Tiger(200, 45, "Цвет глаз", "Место обитания", "12.04.1977"));
    allAnimals.add(new Dog("Собака", "Порода", "Нет", "Цвет шерсти", "Дата рождения", 45, 35, "Цвет глаз", "Нет"));
    allAnimals.add(new Wolf(150, 45, "Цвет глаз", "Место обитания", "31.12.2009", "Да"));
    allAnimals.add(new Hen(10, 2, "Цвет глаз", 1));
    allAnimals.add(new Stork(100, 5, "Цвет глаз", 0));
    }

    public int size(){
        return allAnimals.size();
    }
}
