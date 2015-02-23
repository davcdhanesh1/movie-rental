package bootcamp;
public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

    @Override
    public String toString() {
        return title;
    }

    private final String title;
	private int priceCode;

	public Movie(final String title, final int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(final int priceCode) {
		this.priceCode = priceCode;
	}

}
