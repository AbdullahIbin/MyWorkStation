import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a cube side:");
        int cubeSide = input.nextInt();
        System.out.print("Type a radius of a circle:");
        int circleRaduis = input.nextInt();
        System.out.print("Type sides for your rectangle:");
        int rectangleSide1 = input.nextInt();
        int rectangleSide2 = input.nextInt();
        System.out.println("Perimeter of a cube is " + (cubeSide*4));
        System.out.println("Perimeter of a circle is " + (2*3.14*circleRaduis));
        System.out.format("Perimeter of a rectangle with %d and %d sides is %d", rectangleSide1, rectangleSide2, (rectangleSide1+rectangleSide2)*2);
    }
}
