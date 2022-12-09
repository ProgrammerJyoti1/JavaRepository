package collection;
/* Movie:
movieid
moviename
director
rating
//getter setter
//cons/para
//toString()

Main:
5 objects
store the 5 objects =>set.
1)find >3.0 movie rating movie name?
 */
public class MovieForSort implements Comparable<MovieForSort> {

		private int movieId;
		private String MovieName;
		private String directorName;
		private float rating;
		
		public MovieForSort() {
			
			// TODO Auto-generated constructor stub
		}

		public MovieForSort(int movieId, String movieName, String directorName, float rating) {
			super();
			this.movieId = movieId;
			MovieName = movieName;
			this.directorName = directorName;
			this.rating = rating;
		}

		public int getMovieId() {
			return movieId;
		}

		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}

		public String getMovieName() {
			return MovieName;
		}

		public void setMovieName(String movieName) {
			MovieName = movieName;
		}

		public String getDirectorName() {
			return directorName;
		}

		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}

		public float getRating() {
			return rating;
		}

		public void setRating(float rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "MovieForSor [movieId=" + movieId + ", MovieName=" + MovieName + ", directorName=" + directorName
					+ ", rating=" + rating + "]";
		}

		public int compareTo(MovieForSort m) {
			
			return Float.compare(m.getRating(), rating);
		}


	}


