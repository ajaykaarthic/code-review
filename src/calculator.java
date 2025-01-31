class Calculator {
    public int divide(int a, int b) {
        return a / b;
    }

    public int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int result = calc.divide(10, 0);
        System.out.println("Division Result: " + result);

        int[] nums = {1, 2, 3, 4};
        System.out.println("Sum: " + calc.sumArray(nums));
    }
}
