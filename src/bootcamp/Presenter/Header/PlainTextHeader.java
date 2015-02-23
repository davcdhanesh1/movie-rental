package bootcamp.Presenter.Header;

import bootcamp.Presenter.Header.StatementHeader;

public class PlainTextHeader extends StatementHeader {
    @Override
    public String get(String name) {
        return "Rental Record for " + name + "\n";
    }

}
