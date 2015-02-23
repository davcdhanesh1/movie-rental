package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public class PlainTextPresenter extends Presenter {

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

}
