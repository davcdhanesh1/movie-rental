package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public class PaperPresenter implements Presenter {

    @Override
    public String getStatement(String name, List<Rental> rentals) {
        String result = "Rental Record for " + name + "\n";

        for (final Rental rental : rentals) {
            result += rental.presentationStatement();
        }

        result += "Amount owed is " + String.valueOf(totalAmount(rentals)) + "\n";
        result += "You earned " + String.valueOf(totalFrequentRenterPoints(rentals)) + " frequent renter points";

        return result;
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
}
