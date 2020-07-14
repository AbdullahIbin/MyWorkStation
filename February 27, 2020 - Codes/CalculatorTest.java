public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.addition(45,36));

        Calculator object = new Calculator();
        System.out.println(object.division(89,23));

        Calculator.multiply(11,11);

        System.out.println(object.subtraction(56,90));
    }
}
