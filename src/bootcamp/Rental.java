package bootcamp;

public class Rental {

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

    @Override
    public String toString() {
        return "\t" + movie + "\t" + String.valueOf(fee()) + "\n";
    }

    public Integer renterPoint() {
        Integer frequentRenterPoints = 1;
        if (movie.getPriceCode() == Movie.NEW_RELEASE
                && daysRented > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
