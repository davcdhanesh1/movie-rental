package bootcamp.Presenter;

import bootcamp.CustomerInfo;
import bootcamp.CustomerTest;
import bootcamp.Movie;
import bootcamp.Rental;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HtmlPresenterTest {

    public static final int DAYS_RENTED = 2;

    @Test
    public void testGetStatement() throws Exception {
        HtmlPresenter htmlPresenter = new HtmlPresenter();
        List<Rental> rentals = new ArrayList<Rental>();
        rentals.add(new Rental(Movie.createChildrenMovie("Train your Dragon"), DAYS_RENTED));
        rentals.add(new Rental(Movie.createNewReleaseMovie("BirdMan"), DAYS_RENTED));
        String customerName = "Dhanesh";
        CustomerInfo customerInfo = new CustomerInfo(customerName, rentals, 7.5, 3);

        String htmlStatement = htmlPresenter.getStatement(customerInfo);

        final StringBuffer expectedHtmlStatement = new StringBuffer();
        expectedHtmlStatement.append("<html><body>");
        expectedHtmlStatement.append("<h2>Rental Record for Dhanesh\n</h2>");
        expectedHtmlStatement.append("<p>\tTrain your Dragon\t1.5\n</p>");
        expectedHtmlStatement.append("<p>\tBirdMan\t6.0\n</p>");
        expectedHtmlStatement.append("<b>Amount owed is 7.5\n</b>");
        expectedHtmlStatement.append("<h2>You earned 3 frequent renter points</h2>");
        expectedHtmlStatement.append("</body></html>");

        assertThat(htmlStatement, is(expectedHtmlStatement.toString()));

    }
}