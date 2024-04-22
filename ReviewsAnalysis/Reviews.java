public class Reviews {
    private final int rate;
    private String comment;

    public Reviews(int theRate, String theComment) {
        rate = theRate;
        comment = theComment;
    }

    public int getRate() {
        return rate;
    }

    public String getComment() {
        if (comment.isEmpty()) {
            comment = "\"\"";
        } else {
            comment = "\"" + comment + "\"";
        }
        return comment;
    }
}
