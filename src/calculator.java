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
        System.out.println("Hello");
    }
}
