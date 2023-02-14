//public class program {
//    public static void main(String[] args) {
//        System.out.print("Hello, world!");
//    }
//}
// Дан массив чисел, нужно сформировать новую выборку из только четных чисел:
//1. Уточнить ТЗ
//2. Декомпозиция - разделение на задачи:
// 1 Задать массив 2 Заполинить 2.1 случайными числами 2.2 с руки 2.3 из файла и тд
// 3 Количесвто четных элементов в исходной выборке 4 Печать 4.1 в файл 4.2 в терминал
// 5 Сформировать массив четных чисел
//3. Создание общего репозитория Git и деление по веткам по задачам

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        int len = getNumberByUser("Введите количество элементов ");
        int[] items = createArray(len);
        fillArray(items, 0, 10);
        print2(items);

        int evenCount = getCountEvenItems(items);
        int[] evenItems = getEvenItems(items, evenCount);
        print2(evenItems);
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(evenItems));
    }

// Метод создания массива
    public static int[] createArray(int size) {
        return new int[size];
    }

// Метод, получающий значение от пользователя
    public static int[] getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

// Метод заполнения массива
    public static void fillArray(int[] col, int min, int max) {
        int count = col.length;
        int index = 0;
        while (index < count) {
            col[index] = random.nextInt(min, max);
            index = index + 1;
        }
    }

//Печать результата
    public static String print (int[] data) {
        String output = "";
        int count = data.length;

        int index = 0;
        while (index < count) {
            output += data[index] + " "; // Вместо System.out.print() тк он зависим от консоли, лучше врнуть строку
            index = index +1;
        }
        return output;
    }
 
// Получение только четных чисел
// Принимает массив исходных данных и количество этих четных чисел
    public static int[] getEventItems(int[] rawData, int countEvenElements) { 
        int count = rawData.length;
// Внутри сформировывает новый массив 
        int[] evenItems = createArray(countEvenElements);

        int k = 0;

        for (int i = 0; i < count ; i++) {
            if (rawData [i] % 2 == 0) {
                evenItems [k] = rawData [i];
                k++;
            }
        }
        return evenItems;
    }

// Получение колличества четных чисел
    static int getCountEvenItems(int[] array) {
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length; i ++){
            if (array [i] % 2 == 0)
            count ++;
        }
        return count;
    }
}