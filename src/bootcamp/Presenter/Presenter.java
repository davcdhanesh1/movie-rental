package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public abstract class Presenter {

    public abstract String getStatement(String name, List<Rental> rentals);

    protected String getTotalFrequentRenterPoint(List<Rental> rentals) {
        return "You earned " + totalFrequentRenterPoints(rentals) + " frequent renter points";
    }

    protected String getTotalAmount(List<Rental> rentals) {
        return "Amount owed is " + totalAmount(rentals) + "\n";
    }

    private Integer totalFrequentRenterPoints(List<Rental> rentals) {
        int frequentRenterPoints = 0;
        for (final Rental rental: rentals) {
            frequentRenterPoints += rental.renterPoint();
        }
        return frequentRenterPoints;
    }

    private double totalAmount(List<Rental> rentals) {
        double totalAmount = 0;
        for (final Rental rental: rentals) {
            totalAmount += rental.fee();
        }
        return totalAmount;
    }

    protected String getCustomerName(String name) {
        return "Rental Record for " + name + "\n";
    }
}
