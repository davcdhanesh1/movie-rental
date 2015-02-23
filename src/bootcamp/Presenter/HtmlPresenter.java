package bootcamp.Presenter;

import bootcamp.Presenter.Body.HtmlBody;
import bootcamp.Presenter.Body.StatementBody;
import bootcamp.Presenter.Footer.HtmlFooter;
import bootcamp.Presenter.Footer.StatementFooter;
import bootcamp.Presenter.Header.HtmlHeader;
import bootcamp.Presenter.Header.StatementHeader;
import bootcamp.Rental;

import java.util.List;

public class HtmlPresenter extends Presenter {
    private StatementHeader htmlHeader = new HtmlHeader();
    private StatementBody htmlBody = new HtmlBody();
    private StatementFooter htmlFooter = new HtmlFooter();

    @Override
    public String getStatement(String name, List<Rental> rentals) {
        String result = new String();
        result += "<html><body>";
        result += htmlHeader.get(name);
        result += htmlBody.get(rentals);
        result += htmlFooter.get(rentals);
        result += "</body></html>";
        return result;
    }

}
