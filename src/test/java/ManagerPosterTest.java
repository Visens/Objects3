import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {
	ManagerPoster manager = new ManagerPoster();

	Poster movie1 = new Poster(101, "Титаник", 1998);
	Poster movie2 = new Poster(212, "Пираты Карибского моря", 2005);
	Poster movie3 = new Poster(333, "Властелин колец: Братство кольца", 2001);
	Poster movie4 = new Poster(333, "Властелин колец: Две крепости", 2002);
	Poster movie5 = new Poster(333, "Властелин колец: Возвращение короля", 2003);

	@BeforeEach
	public void setup () {
		manager.addMovie(movie1);
		manager.addMovie(movie2);
		manager.addMovie(movie3);
		manager.addMovie(movie4);
		manager.addMovie(movie5);
	}

	@Test
	public void shouldShowAllPosters () {
		Poster[] expected = {movie1, movie2, movie3, movie4, movie5};
		Poster[] actual = manager.findAll();

		Assertions.assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowLastPosters () {
		Poster[] expected = {movie5, movie4, movie3};
		Poster[] actual = manager.getLastMovie();

		Assertions.assertArrayEquals(expected, actual);
	}
}
/*	@Test
	public void shouldReverseAllMovies() {
		Poster[] expected = {movie5, movie4, movie3, movie2, movie1};
		Poster[] actual = manager.getMovie();

		Assertions.assertArrayEquals(expected, actual);
	}*/