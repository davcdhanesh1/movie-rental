package bootcamp;

import bootcamp.Presenter.Presenter;

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

	public String createStatement(Presenter presenter) {
        CustomerInfo customerInfo = new CustomerInfo(name, rentals, totalAmount(), totalFrequentRenterPoints());
        return presenter.getStatement(customerInfo);
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
