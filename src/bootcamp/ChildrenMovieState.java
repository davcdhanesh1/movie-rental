package bootcamp;

public class ChildrenMovieState extends MovieState {

    @Override
    public double price(Integer daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
