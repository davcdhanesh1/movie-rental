package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public class HtmlPresenter extends Presenter {
    @Override
    public String getStatement(String name, List<Rental> rentals) {
        String result = "<html><body>";
        result += "<h2>" + "Rental Record for " + name + "\n" + "</h2>";

        for (final Rental rental : rentals) {
            result += "<p>"+ rental.presentationStatement() + "</p>";
        }

        result += "<b>" + "Amount owed is " + String.valueOf(totalAmount(rentals)) + "\n" + "</b>";
        result += "<h2>" + "You earned " + String.valueOf(totalFrequentRenterPoints(rentals)) + " frequent renter points" + "</h2>";
        result += "</body></html>";

        return result;
    }
}
