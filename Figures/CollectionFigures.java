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
                createTriagle(input, allFigure);
                createNewFigures(input, allFigure);
            case 2:
                createSquare(input, allFigure);
                createNewFigures(input, allFigure);
            case 3:
                createRectangle(input, allFigure);
                createNewFigures(input, allFigure);
            case 4:
                createCircle(input, allFigure);
                createNewFigures(input, allFigure);
            case 5:
                programMenu(input, allFigure);
            }
            // case 1:
            //   allFigures.addTriangle(input);
            //  Program.programMenu(input, allFigure);;
            //case 2:
            //    allFfigures.addSquare(input);
            //    Program.programMenu(input, allFigure);;
            //case 3:
            //    allFigures.addRectangle(input);
            //    Program.programMenu(input, allFigure);;
            //case 4:
            //    allFigures.addCircle(input);
            //    Program.programMenu(input, allFigure);;
        }

        private static void createTriagle(Scanner input, ArrayList<Figures> allFigure) {
            System.out.println("\nНазовите фигуру: ");
            String name = input.nextLine();
            System.out.print("Введите сторону a: ");
            Double a = input.nextDouble();
            System.out.print("Введите сторону b: ");
            Double b = input.nextDouble();
            System.out.print("Введите сторону c: ");
            Double c = input.nextDouble();
            allFigure.add(new Triangle(name, a, b, c));
    
        }
    
        private static void createSquare(Scanner input, ArrayList<Figures> allFigure) {
            System.out.println("\nНазовите фигуру: ");
            String name = input.nextLine();
            System.out.print("Введите сторону a: ");
            Double a = input.nextDouble();
            allFigure.add(new Square(name, a));
    
        }
    
        private static void createRectangle(Scanner input, ArrayList<Figures> allFigure) {
            System.out.println("\nНазовите фигуру: ");
            String name = input.nextLine();
            System.out.print("Введите сторону a: ");
            Double a = input.nextDouble();
            System.out.print("Введите сторону b: ");
            Double b = input.nextDouble();
            allFigure.add(new Rectangle(name, a, b));
        }
    
        private static void createCircle(Scanner input, ArrayList<Figures> allFigure) {
            System.out.println("\nНазовите фигуру: ");
            String name = input.nextLine();
            System.out.print("Введите радиус: ");
            Double radius = input.nextDouble();
            allFigure.add(new Circle(name, radius));
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