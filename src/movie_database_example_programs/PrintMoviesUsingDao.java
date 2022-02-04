package movie_database_example_programs;

import java.util.List;

import data_access.MovieDAO;
import model.Movie;

/**
 * Database access using the DAO design pattern.
 */
public class PrintMoviesUsingDao {

	public static void main(String[] args) {
		System.out.println("=== Print movies (DAO version) ===");

		MovieDAO movieDAO = new MovieDAO();

		List<Movie> movieList = movieDAO.getMovies();

		if (movieList == null) {
			System.out.println("The database is temporarily unavailable. Please try again later.");
		} else {
			for (Movie movie : movieList) {
				System.out.println(movie.getYear() + " " + movie.getName() + " (" + movie.getDirector() + ")");
			}
		}
	}
}
// End
