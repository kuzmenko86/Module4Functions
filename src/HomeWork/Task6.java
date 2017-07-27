package HomeWork;

/**
 * Created by Admin on 7/27/2017.
 */
public class Task6 {
    public static int countX = 1;
    public static int countY = 2;

    public static void main(String[] args) {
        drawRectangle(4, 2);
    }

    public static void drawRectangle(int x, int y) {

        if (countX <= x){
            System.out.print("+ ");
            countX++;
            drawRectangle(x, y);
        }
        if (countY <= y){
            countX = 1; //reset count x to original value
            countY++;
            System.out.println(); // just empty line
            drawRectangle(x, y);
        }
        return;
    }
}
