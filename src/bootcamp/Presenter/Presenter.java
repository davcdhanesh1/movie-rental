package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public abstract class Presenter {

    public abstract String getStatement(String name, List<Rental> rentals);

    protected Integer totalFrequentRenterPoints(List<Rental> rentals) {
        int frequentRenterPoints = 0;
        for (final Rental rental: rentals) {
            frequentRenterPoints += rental.renterPoint();
        }
        return frequentRenterPoints;
    }

    protected double totalAmount(List<Rental> rentals) {
        double totalAmount = 0;
        for (final Rental rental: rentals) {
            totalAmount += rental.fee();
        }
        return totalAmount;
    }
}
