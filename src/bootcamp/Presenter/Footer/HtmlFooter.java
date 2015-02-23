package bootcamp.Presenter.Footer;

import bootcamp.Rental;

import java.util.List;

public class HtmlFooter extends StatementFooter {
    @Override
    public String get(List<Rental> rentals) {
        String footer = new String();
        footer += "<b>Amount owed is " + totalAmount(rentals) + "\n</b>";
        footer += "<h2>You earned " + totalFrequentRenterPoints(rentals) + " frequent renter points</h2>";
        return footer;
    }
}
