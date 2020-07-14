package test;

public class MethodsMain {
    public void myMethod(){
        System.out.println("Print my method from Mmain");
    }

    public static void minFunc(int a, int b){
        int min;
        if(a > b){
            min = b;
        }
        else{
            min = a;
        }
        System.out.println(min);
    }
}
