package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public class PlainTextPresenter extends Presenter {

    @Override
    public String getStatement(String name, List<Rental> rentals) {
        String result = getCustomerName(name);
        result = getBodyForPlainText(rentals, result);
        result += getTotalAmount(rentals);
        result += getTotalFrequentRenterPoint(rentals);

        return result;
    }

    private String getBodyForPlainText(List<Rental> rentals, String result) {
        for (final Rental rental : rentals) {
            result += rental.presentationStatement();
        }
        return result;
    }

}
