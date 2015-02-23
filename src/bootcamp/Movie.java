package bootcamp;
public class Movie {

    @Override
    public String toString() {
        return title;
    }

    private final String title;
    private MovieState movieState;

	private Movie(final String title, final MovieState movieState) {
		this.title = title;
        this.movieState = movieState;
    }

    public double price(Integer daysRented) {
        return movieState.price(daysRented);
    }

    public Integer renterPoint(int daysRented) {
        return movieState.renterPoint(daysRented);
    }

    public static Movie createNewReleaseMovie(String movieName) {
        return new Movie(movieName,new NewReleaseMovieState());
    }

    public static Movie createRegularRelease(String movieName) {
        return new Movie(movieName, new RegularMovieState());
    }

    public static Movie createChildrenMovie(String movieName) {
        return new Movie(movieName, new ChildrenMovieState());
    }

    public void changeStateToRegularMovie() {
        movieState = new RegularMovieState();
    }
}
