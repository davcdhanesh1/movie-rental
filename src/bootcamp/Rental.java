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
        return movie.price(daysRented);
    }

    public Integer renterPoint() {
        return movie.renterPoint(daysRented) + BASE_POINTS;
    }

    public String presentationStatement() {
        return "\t" + movie + "\t" + String.valueOf(fee()) + "\n";
    }
}
