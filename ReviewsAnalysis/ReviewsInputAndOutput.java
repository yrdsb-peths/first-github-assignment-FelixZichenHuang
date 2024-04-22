import java.util.Scanner;

public class ReviewsInputAndOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the number of reviews: ");
        int number = scanner.nextInt();
        int count = 0;
        do {
            System.out.print("Please input rate #" + (count + 1) + ": ");
            int rate = scanner.nextInt();
            if (rate < 1 || rate > 5) {
                System.out.println("The rate cannot be smaller than 1 or greater than 5!");
                continue;
            }
            String temp = scanner.nextLine();
            System.out.print("Please input comment #" + (count + 1) + ": ");
            String comment = scanner.nextLine();
            Reviews review = new Reviews(rate, comment);
            ReviewsAnalysis.addReview(review);
            count += 1;
        } while (count < number);
        System.out.println();
        System.out.println("Product Average Rate: " + ReviewsAnalysis.getAverageRate());
        System.out.println("Product Quality: " + ReviewsAnalysis.productQualityAnalysis());
        System.out.println("Positive Comments: " + ReviewsAnalysis.getPositiveComments());
        System.out.println("Neutral Comments: " + ReviewsAnalysis.getNeutralComments());
        System.out.println("Negative Comments: " + ReviewsAnalysis.getNegativeComments());
    }
}
