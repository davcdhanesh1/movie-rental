package bootcamp.Presenter.Header;

public class HtmlHeader extends StatementHeader {
    @Override
    public String get(String name) {
        return "<h2>Rental Record for " + name + "\n</h2>";
    }
}
