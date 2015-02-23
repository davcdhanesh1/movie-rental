package bootcamp.Presenter;

import bootcamp.CustomerInfo;
import bootcamp.Presenter.Body.PlainTextBody;
import bootcamp.Presenter.Body.StatementBody;
import bootcamp.Presenter.Footer.PlainTextFooter;
import bootcamp.Presenter.Footer.StatementFooter;
import bootcamp.Presenter.Header.PlainTextHeader;
import bootcamp.Presenter.Header.StatementHeader;
import bootcamp.Rental;

import java.util.List;

public class PlainTextPresenter extends Presenter {

    private StatementHeader plainTextHeader = new PlainTextHeader();
    private StatementBody plainTextBody = new PlainTextBody();
    private StatementFooter plainTextFooter = new PlainTextFooter();

    @Override
    public String getStatement(CustomerInfo customerInfo) {
        String result = new String();
        result += plainTextHeader.get(customerInfo.name);
        result += plainTextBody.get(customerInfo.rentals);
        result += plainTextFooter.get(customerInfo.totalAmount, customerInfo.totalFrequentRenterPoints);
        return result;
    }
}
