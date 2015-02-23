package bootcamp;

public class ChildrenMovieType implements MovieType {
    @Override
    public Integer renterPoint(int daysRented) {
        return 0;
    }

    @Override
    public double price(Integer daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }
        return thisAmount;
    }
}
