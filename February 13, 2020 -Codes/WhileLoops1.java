import java.util.Scanner;

public class WhileLoops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type any number between 1 & 10 inclusively: ");
        int number = input.nextInt();

        if(number > 0){
            while (number <= 10){
                number++;
            }
            System.out.println("The number is between 1 & 10");
        }
        else{
            System.out.println("The number is out of range");
        }

    }
}
