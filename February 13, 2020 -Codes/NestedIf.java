public class NestedIf {
    public static void main(String[] args) {
        int i = 11;
        if(i == 11){
            if(i > 20){
                System.out.println(i + " is smaller than 20");
            }
            if(i > 15){
                System.out.println(i + " is also greater than 15");
            }
            else{
                System.out.println(i + " is smaller than 15");
            }
        }
    }
}
