package HomeWork;

/**
---Задание 1-------------------------------------
 Написать функцию которая считает в консоли до числа Х.
 Аргументы функции: число Х

 Например Х = 5.
 Вывод программы:
 1
 2
 3
 4
 5
 */
public class Task1 {
    public static void main(String[] args) {
        countInConsole(25);
    }

    public static void countInConsole(int x) {
        for (int i = 1; i <=x; i++)
            System.out.println(i);
    }
}
