package bootcamp.Presenter.Body;

import bootcamp.Rental;

import java.util.List;

public class PlainTextBody extends StatementBody {
    @Override
    public String get(List<Rental> rentals) {
        String result = new String();
        for (final Rental rental : rentals) {
            result += rental.presentationStatement();
        }
        return result;
    }
}
