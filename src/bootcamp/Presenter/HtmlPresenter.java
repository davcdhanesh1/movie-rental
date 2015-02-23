package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public class HtmlPresenter extends Presenter {
    @Override
    public String getStatement(String name, List<Rental> rentals) {
        String result = "<html><body>";
        result += "<h2>" + getCustomerName(name) + "</h2>";
        result = getBodyForHtml(rentals, result);
        result += "<b>" + getTotalAmount(rentals) + "</b>";
        result += "<h2>" + getTotalFrequentRenterPoint(rentals) + "</h2>";
        result += "</body></html>";

        return result;
    }

    private String getBodyForHtml(List<Rental> rentals, String result) {
        for (final Rental rental : rentals) {
            result += "<p>"+ rental.presentationStatement() + "</p>";
        }
        return result;
    }

}
