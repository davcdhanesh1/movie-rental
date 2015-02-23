package bootcamp;

import java.util.List;

public class CustomerInfo {
    public final String name;
    public final List<Rental> rentals;
    public final double totalAmount;
    public final Integer totalFrequentRenterPoints;

    public CustomerInfo(String name, List<Rental> rentals, double totalAmount, Integer totalFrequentRenterPoints) {
        this.name = name;
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.totalFrequentRenterPoints = totalFrequentRenterPoints;
    }
}
