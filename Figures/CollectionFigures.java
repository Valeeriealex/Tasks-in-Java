package Figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionFigures {
    static ArrayList<Figures>allFigure = new ArrayList<Figures>(); 

    public static void showAll() {
        Collections.sort(allFigure);
        int index = 0;
        for (Figures figur : allFigure) {
            System.out.printf("%d) ", index);
            System.out.println(figur);
            System.out.println("----");
            index++;
        }
    }

    public static void addFigure(Scanner input, ArrayList<Figures> allFigure){
        System.out.println("1. Добавить треугольник");
        System.out.println("2. Добавить квадрат");
        System.out.println("3. Добавить прямоугольник");
        System.out.println("4. Добавить круг");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                allFigures.addTriangle(input);
                Program.programMenu(input, allFigure);;
            case 2:
                allFfigures.addSquare(input);
                Program.programMenu(input, allFigure);;
            case 3:
                allFigures.addRectangle(input);
                Program.programMenu(input, allFigure);;
            case 4:
                allFigures.addCircle(input);
                Program.programMenu(input, allFigure);;
            }
    }
    public static void delleteFigure(Scanner input, ArrayList<Figures> allFigure) {
        showAll();
        System.out.print("\nКакую фигуру удалить?: ");
        int choice = input.nextInt();
        if (choice < allFigure.size()) {
            allFigure.remove(choice);
            System.out.println("Вы удалили фигуру!");
            Program.programMenu(input, allFigure);
        } else
            Program.programMenu(input, allFigure);
    
    }
}