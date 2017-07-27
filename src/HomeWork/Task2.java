package HomeWork;

/**
 ---Задание 2-------------------------------------
 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах

 Например 3 на 2
 Вывод программы:
 + + +
 + + +.
 */
public class Task2 {
    public static void main(String[] args) {
        drawRectangle(3, 4);
    }

    public static void drawRectangle(int x, int y) {
        for (int j = 1; j <=y; j++) {
            for (int i = 1; i <= x; i++)
                System.out.print("+ ");
            System.out.println();
        }
    }
}
