package bootcamp.Presenter.Footer;

import bootcamp.Presenter.Footer.StatementFooter;
import bootcamp.Rental;

import java.util.List;

public class PlainTextFooter extends StatementFooter {
    @Override
    public String get(double totalAmount, Integer totalFrequentRenterPoints) {
        String footer = new String();
        footer += "Amount owed is " + totalAmount + "\n";
        footer += "You earned " + totalFrequentRenterPoints + " frequent renter points";
        return footer;
    }

}
