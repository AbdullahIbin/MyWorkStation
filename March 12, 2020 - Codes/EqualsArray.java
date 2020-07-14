import java.util.Arrays;

public class EqualsArray {
    public static void main(String[] args) {
        int[] a1 = {3,4,5};
        int[] a2 = {3,9,5};
        if(Arrays.equals(a1, a2)){
            System.out.println("Equal elements");
        }
        else
            System.out.println("Elements are NOT equal");

        if(a1.equals(a2)){
            System.out.println("Same objects");
        }
        else
            System.out.println("Not Same Objects");
    }
}