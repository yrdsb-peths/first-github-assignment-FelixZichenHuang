import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        System.out.println("-*- Programming Language: Java -*-");
        System.out.println("-*- Developer: Felix Huang -*-");
        int r = (int) (Math.random() * 1000);
        long start = System.currentTimeMillis();
        for (int i = 1;; i++) {
            System.out.print("Please guess an integer between 0 and 1000: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == r) {
                long end = System.currentTimeMillis();
                long total = end - start;
                System.out.println("Correct! You've tried " + i + " time(s) and spent " + (total / 1000) + " second(s).");
                break;
            } else {
                if (input > r) {
                    System.out.println("The number is too large!");
                } else {
                    System.out.println("The number is too small!");
                }
            }
        }
    }
}