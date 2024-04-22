import java.util.Scanner;

public class PrimeOrComposite {
    public static String determine(int input) {
        int divisor = 2;
        if (input > 1) {
            while (divisor < input) {
                if (input % divisor == 0) {
                    return "This is a composite number.";
                }
                divisor++;
            }
            return "This is a prime number.";
        } else {
            return "This is neither a prime number nor a composite number.";
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input an integer: ");
            int input = scanner.nextInt();
            System.out.println(determine(input));
        }
    }
}