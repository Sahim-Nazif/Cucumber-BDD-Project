package stepdefinitions;

public class Movie {
	
	
	private String movieName;
	private String genre;
	private int price;
	
	public Movie(String movieName, String genre, int price) {
		
		this.movieName=movieName;
		this.genre=genre;
		this.price=price;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
