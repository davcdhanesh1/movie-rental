package bootcamp;

import static org.junit.Assert.assertEquals;

import bootcamp.Presenter.HtmlPresenter;
import bootcamp.Presenter.PaperPresenter;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	private static final int ONE_DAY = 1;
	private static final int TWO_DAYS = 2;
	private static final int THREE_DAYS = 3;
	private static final int FOUR_DAYS = 4;

	private Customer customer;
	private final Movie regular = Movie.createRegularRelease("A New Hope");
	private final Movie children = Movie.createChildrenMovie("A Phantom Menace");
	private final Movie newRelease = Movie.createNewReleaseMovie("Revenge of the Sith");

	@Before
	public void setUp() {
		customer = new Customer("nhpatt");
	}

    @Test
	public void testPaperStatementOneRegular() {
		addRentalOfMovie(regular, TWO_DAYS);

		final StringBuffer expectedStatement = new StringBuffer();
		expectedStatement.append("Rental Record for nhpatt\n");
		expectedStatement.append("\tA New Hope\t2.0\n");
		expectedStatement.append("Amount owed is 2.0\n");
		expectedStatement.append("You earned 1 frequent renter points");
		assertEquals(expectedStatement.toString(), customer.statement(new PaperPresenter()));
    }

    @Test
    public void testHtmlStatementOneRegular() throws Exception {
        addRentalOfMovie(regular, TWO_DAYS);

        final StringBuffer expectedStatement = new StringBuffer();
        expectedStatement.append("<html><body>");
        expectedStatement.append("<h2>Rental Record for nhpatt\n</h2>");
        expectedStatement.append("<p>\tA New Hope\t2.0\n</p>");
        expectedStatement.append("<b>Amount owed is 2.0\n</b>");
        expectedStatement.append("<h2>You earned 1 frequent renter points</h2>");
        expectedStatement.append("</body></html>");
        assertEquals(expectedStatement.toString(), customer.statement(new HtmlPresenter()));
    }

    @Test
	public void testPaperStatementOneRegularMoreThanTwoDays() {
		addRentalOfMovie(regular, THREE_DAYS);

		final StringBuffer expectedStatement = new StringBuffer();
		expectedStatement.append("Rental Record for nhpatt\n");
		expectedStatement.append("\tA New Hope\t3.5\n");
		expectedStatement.append("Amount owed is 3.5\n");
		expectedStatement.append("You earned 1 frequent renter points");
		assertEquals(expectedStatement.toString(), customer.statement(new PaperPresenter()));
	}

	@Test
	public void testPaperStatementOneForChildren() {
		addRentalOfMovie(children, TWO_DAYS);

		final StringBuffer expectedStatement = new StringBuffer();
		expectedStatement.append("Rental Record for nhpatt\n");
		expectedStatement.append("\tA Phantom Menace\t1.5\n");
		expectedStatement.append("Amount owed is 1.5\n");
		expectedStatement.append("You earned 1 frequent renter points");
		assertEquals(expectedStatement.toString(), customer.statement(new PaperPresenter()));
	}

	@Test
	public void testPaperStatementOneForChildrenMoreThanThreeDays() {
		addRentalOfMovie(children, FOUR_DAYS);

		final StringBuffer expectedStatement = new StringBuffer();
		expectedStatement.append("Rental Record for nhpatt\n");
		expectedStatement.append("\tA Phantom Menace\t3.0\n");
		expectedStatement.append("Amount owed is 3.0\n");
		expectedStatement.append("You earned 1 frequent renter points");
		assertEquals(expectedStatement.toString(), customer.statement(new PaperPresenter()));
	}

    @Test
    public void testPaperStatementForMovieInStateOneNewReleaseChangesItsStateToRegularState() throws Exception {
        Movie newReleaseMovie = Movie.createNewReleaseMovie("Birdman");
        addRentalOfMovie(newReleaseMovie, TWO_DAYS);

        final StringBuffer expectedStatementForNewRelease = new StringBuffer();
        expectedStatementForNewRelease.append("Rental Record for nhpatt\n");
        expectedStatementForNewRelease.append("\tBirdman\t6.0\n");
        expectedStatementForNewRelease.append("Amount owed is 6.0\n");
        expectedStatementForNewRelease.append("You earned 2 frequent renter points");
        assertEquals(expectedStatementForNewRelease.toString(), customer.statement(new PaperPresenter()));

        newReleaseMovie.changeStateToRegularMovie();
        final StringBuffer expectedStatementForRegularState = new StringBuffer();
        expectedStatementForRegularState.append("Rental Record for nhpatt\n");
        expectedStatementForRegularState.append("\tBirdman\t2.0\n");
        expectedStatementForRegularState.append("Amount owed is 2.0\n");
        expectedStatementForRegularState.append("You earned 1 frequent renter points");
        assertEquals(expectedStatementForRegularState.toString(), customer.statement(new PaperPresenter()));
    }

    @Test
	public void testPaperStatementOneRentalNewRelease() {
		addRentalOfMovie(newRelease, TWO_DAYS);

		final StringBuffer expectedStatementForNewRelease = new StringBuffer();
		expectedStatementForNewRelease.append("Rental Record for nhpatt\n");
		expectedStatementForNewRelease.append("\tRevenge of the Sith\t6.0\n");
		expectedStatementForNewRelease.append("Amount owed is 6.0\n");
		expectedStatementForNewRelease.append("You earned 2 frequent renter points");
		assertEquals(expectedStatementForNewRelease.toString(), customer.statement(new PaperPresenter()));
	}

	@Test
	public void testPaperStatementNoRentals() {
		assertEquals(
				"Rental Record for nhpatt\nAmount owed is 0.0\nYou earned 0 frequent renter points",
				customer.statement(new PaperPresenter()));
	}

	@Test
	public void testPaperStatementFourRentals() {
		addRentalOfMovie(regular, TWO_DAYS);
		addRentalOfMovie(newRelease, TWO_DAYS);
		addRentalOfMovie(children, THREE_DAYS);
		addRentalOfMovie(regular, ONE_DAY);

		final StringBuffer expectedStatement = new StringBuffer();
		expectedStatement.append("Rental Record for nhpatt\n");
		expectedStatement.append("\tA New Hope\t2.0\n");
		expectedStatement.append("\tRevenge of the Sith\t6.0\n");
		expectedStatement.append("\tA Phantom Menace\t1.5\n");
		expectedStatement.append("\tA New Hope\t2.0\n");
		expectedStatement.append("Amount owed is 11.5\n");
		expectedStatement.append("You earned 5 frequent renter points");
		assertEquals(expectedStatement.toString(), customer.statement(new PaperPresenter()));
	}

	private void addRentalOfMovie(final Movie movie, final int daysRented) {
		customer.addRental(new Rental(movie, daysRented));
	}

}
