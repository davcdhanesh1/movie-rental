package bootcamp;
public class Movie {

    @Override
    public String toString() {
        return title;
    }

    private final String title;
    private MovieType movieType;

	public Movie(final String title, final MovieType movieType) {
		this.title = title;
        this.movieType = movieType;
    }

    public double price(Integer daysRented) {
        return movieType.price(daysRented);
    }

    public Integer renterPoint(int daysRented) {
        return movieType.renterPoint(daysRented);
    }
}
