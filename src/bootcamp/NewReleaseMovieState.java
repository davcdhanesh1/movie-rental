package bootcamp;

public class NewReleaseMovieState extends MovieState {
    @Override
    public Integer renterPoint(int daysRented) {
        Integer frequentRenterPoints = 0;
        if (daysRented > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    @Override
    public double price(Integer daysRented) {
        return daysRented * 3;
    }
}
