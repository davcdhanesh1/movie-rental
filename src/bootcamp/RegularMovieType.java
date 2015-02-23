package bootcamp;

public class RegularMovieType implements MovieType {
    @Override
    public Integer renterPoint(int daysRented) {
        return 0;
    }

    @Override
    public double price(Integer daysRented) {
        double thisAmount = 2;
        if (daysRented > 2) {
            thisAmount += (daysRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
