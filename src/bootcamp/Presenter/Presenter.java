package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public abstract class Presenter {

    public abstract String getStatement(String name, List<Rental> rentals);

}
