package bootcamp.Presenter;

import bootcamp.Rental;

import java.util.List;

public interface Presenter {

    String getStatement(String name, List<Rental> rentals);
}
