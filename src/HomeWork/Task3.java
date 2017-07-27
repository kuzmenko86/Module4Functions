package HomeWork;

/**
 ---Задание 3-------------------------------------
 Перегрузить функцию drawRectangle (задание 2) таким образом,
 что бы она могла принимать на вход только
 1 параметр (ширина квадрата) и рисовать квадрат с равными сторонами
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("With 2 parameters Rectangle: ");
        drawRectangle(3, 4);

        System.out.println("With 1 parameters square: ");
        drawRectangle(10);
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
