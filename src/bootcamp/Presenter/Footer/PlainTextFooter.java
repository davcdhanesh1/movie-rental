package bootcamp.Presenter.Footer;

import bootcamp.Presenter.Footer.StatementFooter;
import bootcamp.Rental;

import java.util.List;

public class PlainTextFooter extends StatementFooter {
    @Override
    public String get(List<Rental> rentals) {
        String footer = new String();
        footer += "Amount owed is " + totalAmount(rentals) + "\n";
        footer += "You earned " + totalFrequentRenterPoints(rentals) + " frequent renter points";
        return footer;
    }
}
