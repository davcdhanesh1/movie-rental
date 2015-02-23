package bootcamp;

public class RegularMovieState extends MovieState {
    @Override
    public double price(Integer daysRented) {
        double thisAmount = 2;
        if (daysRented > 2) {
            thisAmount += (daysRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
