public class IfElse {
    public static void main(String[] args) {
        int degree = 80;
        if(degree <= 32){
            System.out.println("It is cold outside!");
        }
        else if (degree <= 75){
            System.out.println("Nice weather!");
        }
        else{
            System.out.println("Too hot!");
        }
    }
}
