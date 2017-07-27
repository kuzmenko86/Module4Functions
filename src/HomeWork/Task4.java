package HomeWork;

/**
 ---Задание 4-------------------------------------
 Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
 А возврыщает максимальное из этих двух.
 Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)

 */
public class Task4 {
    public static void main(String[] args) {
        int i1 = 4;
        int i2 = 3;
        System.out.println("which one is bigger: " + i1 + " or " + i2);
        System.out.println("Bigger int is - " + getMax(i1,i2));getMax(i1,i2);

        float f1 = 12.45f;
        float f2 = 3.14f;
        System.out.println("which one is bigger: " + f1 + " or " + f2);
        System.out.println("Bigger float is - " + getMax(f1,f2));
    }

    public static int getMax(int x, int y) {
        return x > y ? x : y;

    }
    public static float getMax(float x, float y) {
        return x > y ? x : y;
    }
}
