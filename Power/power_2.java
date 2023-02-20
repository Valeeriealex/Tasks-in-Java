package Power;

import java.util.Scanner;
import java.io.*;

public class power_2 {
    public static void main(String args[])
    {
        System.out.print("Введите число, которое надо возвести в степень: "); //пользователь вводит число
		Scanner scan1 = new Scanner(System.in);                                 //сканнер считывает число
		int number = scan1.nextInt();                                           //в переменную помещается отсканированое число

		System.out.print("Введите степень: ");                                //аналогично
		Scanner scan2 = new Scanner(System.in);
		int power = scan2.nextInt();
    }

    public static int NumberToPower (number, power) 
    { 
        if (power == 1) {
            return number;
        } else {
            return number * pow(number, power - 1);
        }
    }
}
