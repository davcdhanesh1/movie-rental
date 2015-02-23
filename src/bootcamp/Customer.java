package bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private final String name;
	private final List<Rental> rentals = new ArrayList<Rental>();

	public Customer(final String name) {
		this.name = name;

	}

	public void addRental(final Rental arg) {
		rentals.add(arg);
	}

	public String statement() {
        String result = "Rental Record for " + name + "\n";

        for (final Rental rental : rentals) {
            result += rental.presentationStatement();
        }
        
        result += "Amount owed is " + String.valueOf(totalAmount()) + "\n";
        result += "You earned " + String.valueOf(totalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private Integer totalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (final Rental rental: rentals) {
            frequentRenterPoints += rental.renterPoint();
        }
        return frequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (final Rental rental: rentals) {
            totalAmount += rental.fee();
        }
        return totalAmount;
    }

}
