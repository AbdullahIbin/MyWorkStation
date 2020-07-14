public class NestedFor {
    public static void main(String[] args) {
        for(int  row = 1; row < 10; row++){
            for(int columns = 1; columns < 10; columns++){
                System.out.print(columns * row + "\t");
            }
            System.out.println();
        }
    }
}