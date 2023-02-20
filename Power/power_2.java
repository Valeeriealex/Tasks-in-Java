package Power;

import java.util.Scanner;

public class power_2 {
    public static void main(String args[]) {                                     //главный метод, принимающий аргументы
        System.out.print("Введите число, которое надо возвести в степень: "); //пользователь вводит число
		Scanner scan1 = new Scanner(System.in);                                 //сканнер считывает число
		int number = scan1.nextInt();                                           //в переменную помещается отсканированое число
    

		System.out.print("Введите степень: ");                                //аналогично
		Scanner scan2 = new Scanner(System.in);
		int power = scan2.nextInt();
        
        System.out.println("Число " + number + " в степени " + power + " равно " + Math.pow(number, power)); //возведение в степень

        scan1.close();
        scan2.close();
    }
}

