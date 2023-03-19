package Classes;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayListClass<Integer> intList = new ArrayListClass<Integer>();
        intList.add(1); // добавление элемента
        intList.add(2);
        intList.add(3);
        intList.printArray(); // печать масива
        intList.remForIdx(1); // удаление элемента по индексу
        intList.printArray();
        intList.removeData(2); // удаление элемента по значению
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимума
        System.out.println(intList.maxData()); // Поиск максимума
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIDX(1)); // Поиск элемента по индексу (если его нет то возвращает - 1)
        System.out.println(intList.findData(874)); // Проверка наличия элемента в массиве. Возвращает true, если элементв массиве есть, false, если нет
        try {
            intList.BubbleSort();
            System.out.print("Результат: "); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayListClass<String> stringList = new ArrayListClass<>();
        stringList.add("Строка"); // добавление элемента
        stringList.printArray(); // печать
        stringList.remForIdx(1);
        stringList.printArray();


    }
}
