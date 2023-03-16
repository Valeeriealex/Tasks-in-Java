package Figures;

public abstract class Figures {
    
}
public static void showAll() {
    Collections.sort(allFigures);
    int index = 0;
    for (Figures figur : allFigures) {
        System.out.printf("%d) ", index);
        System.out.println(figur);
        System.out.println("----");
        index++;
    }
//Периметр

//Площадь