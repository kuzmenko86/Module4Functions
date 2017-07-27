package HomeWork;

import java.util.Scanner;

/**
 ---Задание 7 (дополнительно)------------
 Написать программу, в которой выполнены все шесть предыдущих заданий.
 Каждое задание выполняется в отдельной функции. В пределах этой же функции
 происходит ввод с консоли необходимых данных.
 Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6).
 Затем программа вызывает соответствующую функцию для решения этой задачи.
 По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.
 Если да - опять спрашивает какую задачу.
 */
public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which of the home task tasks you would like to resolve ? ");
        System.out.println("Please enter value from 1 to 6");
        int taskNumber = sc.nextInt();

        switch (taskNumber){
            case 1: countInConsole();
                break;
            case 2: drawRectangleMain(2);
                break;
            case 3: drawRectangleMain(3);
                break;
            case 4: drawRectangle(2);
                break;
            case 5: drawRectangle(2);
                break;
        }

    }
    public static void countInConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter x value and I will count till x ");
        int x = sc.nextInt();
        for (int i = 1; i <=x; i++)
            System.out.println(i);
    }
    public static void drawRectangleMain(int taskN){
        Scanner sc = new Scanner(System.in);
        if (taskN == 3) {
            System.out.println("Please enter x value");
            int x = sc.nextInt();
            drawRectangle(x);
        }
        if (taskN == 2) {
            System.out.println("Please enter x value");
            int x = sc.nextInt();
            System.out.println("Please enter y value");
            int y = sc.nextInt();
            drawRectangle(x, y);
        }
    }
    public static void drawRectangle(int x, int y) {

        for (int j = 1; j <=y; j++) {
            for (int i = 1; i <= x; i++)
                System.out.print("+ ");
            System.out.println();
        }
    }

    public static void drawRectangle(int xy) {
        for (int j = 1; j <=xy; j++) {
            for (int i = 1; i <= xy; i++)
                System.out.print("+ ");
            System.out.println();
        }
    }

}
