public class ManagerPoster {
	private Poster[] movies = new Poster[0];
	private int limit;

	public ManagerPoster() {
		this.limit = 3;
	}
	public void ManagerPoster (int limit) {
		this.limit = limit;
	}

	public void addMovie(Poster movie) {
		Poster[] tmp = new Poster[movies.length + 1];
		for (int i = 0; i < movies.length; i++) {
			tmp[i] = movies[i];
		}
		tmp[tmp.length - 1] = movie;
		movies = tmp;
	}

	public Poster[] findAll() {
		return movies;
	}

	public Poster[] getLastMovie() {
		int resultLength;
		if (movies.length < limit) {
			resultLength = movies.length;
		} else {
			resultLength = limit;
		}
		Poster[] tmp = new Poster[resultLength];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = movies[movies.length - 1 - i];
		}
		return tmp;
	}
}
