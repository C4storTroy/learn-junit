package testing;

public class Pessoa {

	private String firstName;
	private int maxBooks;

	// O metodo construtor
	public Pessoa()
	{
		firstName = "Lucio";
		maxBooks = 3;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getMaxBooks() {
		return maxBooks;
	}

	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}
}