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

	public String statement(Presenter presenter) {
        return presenter.getStatement(name, rentals);
    }
}
