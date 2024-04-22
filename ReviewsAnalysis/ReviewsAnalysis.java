import java.util.ArrayList;

public class ReviewsAnalysis {
    private static final ArrayList<Reviews> reviews = new ArrayList<>();

    public static void addReview(Reviews theReview) {
        reviews.add(theReview);
    }

    public static double getAverageRate() {
        double rate = 0;
        for (Reviews r : reviews) {
            rate += r.getRate();
        }
        if (!reviews.isEmpty()) {
            return rate / reviews.size();
        } else {
            return 0;
        }
    }

    public static String productQualityAnalysis() {
        double averageRate = getAverageRate();
        if (averageRate == 5) {
            return "Perfect";
        } else if (averageRate >= 4) {
            return "Good";
        } else if (averageRate >= 3) {
            return "Average";
        } else if (averageRate >= 2) {
            return "Not Good";
        } else if (averageRate >= 1) {
            return "Poor";
        }
        return "No Information";
    }

    public static ArrayList<String> getPositiveComments() {
        ArrayList<String> positiveComments = new ArrayList<>();
        for (Reviews r : reviews) {
            if (r.getRate() >= 4 && r.getRate() <= 5) {
                positiveComments.add(r.getComment());
            }
        }
        return positiveComments;
    }

    public static ArrayList<String> getNeutralComments() {
        ArrayList<String> neutralComments = new ArrayList<>();
        for (Reviews r : reviews) {
            if (r.getRate() == 3) {
                neutralComments.add(r.getComment());
            }
        }
        return neutralComments;
    }

    public static ArrayList<String> getNegativeComments() {
        ArrayList<String> negativeComments = new ArrayList<>();
        for (Reviews r : reviews) {
            if (r.getRate() >= 1 && r.getRate() < 3) {
                negativeComments.add(r.getComment());
            }
        }
        return negativeComments;
    }
}
