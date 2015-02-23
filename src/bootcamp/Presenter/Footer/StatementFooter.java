package bootcamp.Presenter.Footer;

import bootcamp.Rental;

import java.util.List;

public abstract class StatementFooter {
    public abstract String get(double totalAmount, Integer totalFrequentRenterPoints);
}
