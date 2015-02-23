package bootcamp;

public interface MovieState {
    double price(Integer daysRented);

    Integer renterPoint(int daysRented);
}
