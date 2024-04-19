import java.util.Scanner;

public class Fibonacci {
    public int[] generateSequence(int length) {
        int[] fibonacci = new int[length];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < length; i++) {
            fibonacci[i] = Math.abs(fibonacci[i - 1] + fibonacci[i - 2]);
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the length of the Fibonacci sequence: ");
            int length = scanner.nextInt();
            Fibonacci fibonacci = new Fibonacci();
            int[] sequence = fibonacci.generateSequence(length);
            for (int number : sequence) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
