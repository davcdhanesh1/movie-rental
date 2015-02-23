package bootcamp.Presenter.Footer;

import bootcamp.Rental;

import java.util.List;

public class HtmlFooter extends StatementFooter {
    @Override
    public String get(double totalAmount, Integer totalFrequentRenterPoints) {
        String footer = new String();
        footer += "<b>Amount owed is " + totalAmount + "\n</b>";
        footer += "<h2>You earned " + totalFrequentRenterPoints + " frequent renter points</h2>";
        return footer;
    }
}
