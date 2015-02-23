package bootcamp;

public class Rental {

    private static final Integer BASE_POINTS = 1;
    private final Movie movie;
	private final int daysRented;

	public Rental(final Movie movie, final int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

    public double fee() {
        double thisAmount = 0;
        thisAmount = movie.price(daysRented);
        return thisAmount;
    }

    public Integer renterPoint() {
        Integer frequentRenterPoints = movie.renterPoint(daysRented);
        return frequentRenterPoints + BASE_POINTS;
    }

    public String presentationStatement() {
        return "\t" + movie + "\t" + String.valueOf(fee()) + "\n";
    }
}
