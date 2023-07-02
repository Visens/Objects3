public class Poster {
	private int id;
	private String movieName;
	private int releaseYear;
	private int addDate;

	public Poster (int id, String movieName, int releaseYear){
		this.id = id;
		this.movieName = movieName;
		this.releaseYear = releaseYear;
	}


	public int getId() {
		return id;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}
	public void settId(int id) {
		this.id = id;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
}
