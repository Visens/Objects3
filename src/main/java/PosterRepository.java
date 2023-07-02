public class PosterRepository {
	private Poster[] movies = new Poster[0];

	public void addMovie (Poster movie) {
		Poster[] tmp = new Poster[movies.length + 1];
		for (int i = 0; i < movies.length; i++) {
			tmp[i] = movies[i];
		}
		tmp[tmp.length - 1] = movie;
		movies = tmp;
	}
	public void removeById (int id) {
		Poster[] tmp = new Poster[movies.length - 1];
		int copyToIndex = 0;
		for (Poster movie : movies) {
			if (movie.getId() != id) {
				tmp[copyToIndex] = movie;
				copyToIndex++;
			}
		}
		movies = tmp;
	}
	public Poster[] getMovies () {
		return movies;
	}


}
