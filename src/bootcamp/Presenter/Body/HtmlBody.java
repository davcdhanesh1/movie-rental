package bootcamp.Presenter.Body;

import bootcamp.Rental;

import java.util.List;

public class HtmlBody extends StatementBody {

    @Override
    public String get(List<Rental> rentals) {
        String result = new String();
        for (final Rental rental : rentals) {
            result += "<p>"+ rental.presentationStatement() + "</p>";
        }
        return result;
    }
}
