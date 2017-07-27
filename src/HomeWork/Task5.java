package HomeWork;

/**
 --Задание 5-------------------------------------
 Решить задачу 1, без использования циклов. Использовав рекурсию.
 */
public class Task5 {

    public static int c = 1;

    public static void main(String[] args) {
        countInConsole(9);
    }

    public static void countInConsole(int x) {
        if (c <= x){
            System.out.println(c++);
            countInConsole(x);
        } else {
            return;
        }
    }
}
