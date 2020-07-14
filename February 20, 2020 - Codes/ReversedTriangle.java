public class ReversedTriangle {
    public static void main(String[] args) {
        for(int row = 1; row <= 5; row++){
            for(int columns = 1; columns <= 6 - row; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
