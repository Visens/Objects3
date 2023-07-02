import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosterTest {
	PosterRepository movie = new PosterRepository();
	Poster movie1 = new Poster(101, "Титаник", 1998);
	Poster movie2 = new Poster(212, "Пираты Карибского моря", 2005);
	Poster movie3 = new Poster(333, "Властелин колец: Братство кольца", 2001);
	Poster movie4 = new Poster(333, "Властелин колец: Две крепости", 2002);
	Poster movie5 = new Poster(333, "Властелин колец: Возвращение короля", 2003);

	@Test
	public void testWorkManagerPoster() {
		movie.addMovie(movie1);
		movie.addMovie(movie2);
		movie.addMovie(movie3);
		movie.removeById(movie2.getId());
		Poster[] expected = {movie1, movie3};
		Poster[] actual = movie.getMovies();

		Assertions.assertArrayEquals(expected, actual);
	}
/*	@Test
	public void testResult() {
		movie.addMovie(movie1);
		movie.addMovie(movie2);
		movie.addMovie(movie3);
		movie.addMovie(movie4);
		movie.addMovie(movie5);
		Poster[] expected = {movie1, movie2, movie3, movie4, movie5};
		Poster[] actual = movie.getMovies();

		Assertions.assertArrayEquals(expected, actual);
	}*/


}
