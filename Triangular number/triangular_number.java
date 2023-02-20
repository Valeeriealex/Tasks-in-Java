// Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;

public class triangular_number {
    // Метод получения числа от пользователя
    public static void main (String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println(a);
        System.out.println("Треугольное число = " + Triangle(a));
    }
    // Метод вычисления треугольного числа
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle (num*(num + 1) / 2); //или (num - 1) + num
    }

    //public static String print (int a, int num) {
    //    return ("Треугольное число = " + Triangle(a));
    }