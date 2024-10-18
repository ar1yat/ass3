package Iterator;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Коллекция фильмов на основе списка
        List<String> listOfMovies = Arrays.asList("Inception", "The Matrix", "Interstellar");
        ListMovieCollection listMovieCollection = new ListMovieCollection(listOfMovies);
        Iterator<String> listIterator = listMovieCollection.createIterator();

        System.out.println("Movies from List:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Коллекция фильмов на основе массива
        String[] arrayOfMovies = {"Avatar", "Titanic", "Star Wars"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(arrayOfMovies);
        Iterator<String> arrayIterator = arrayMovieCollection.createIterator();

        System.out.println("\nMovies from Array:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
