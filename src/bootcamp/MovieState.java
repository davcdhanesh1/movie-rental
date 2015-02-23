package bootcamp;

public abstract class MovieState {
    public abstract double price(Integer daysRented);

    public Integer renterPoint(int daysRented) {
        return 0;
    }
}
