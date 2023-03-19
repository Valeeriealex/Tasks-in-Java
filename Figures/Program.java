package Figures;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CollectionFigures all = new CollectionFigures();
        programMenu(input, CollectionFigures());
        input.close();

    }
}
