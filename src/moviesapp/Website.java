package moviesapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 Scanner :
 keep showing menu until user exits
 Search by:
 1 Genre
 2 Director
 3 Year
 4 For children
 5 Exit

 1 -> which genre? - Drama : Movies found with given genre: print movies
 2 -> which director? - Nolan : Movies found with given dir: print movies
 3
 4 - > Movies for children : print movies
 5 -> Thanks for using Movies app
 */

public class Website {
    public static void main(String[] args) {
     // for(Movie m : Database.provide()) System.out.println(m);
     // List<Movie> movies = searchByGenre("Crime");
       // List<Movie> movies = searchByDirector("Nolan");
        List<Movie> movies = searchByYear(2000,2015);

      print(movies);
    }

    private static List<Movie> searchByYear(int year1, int year2){
        List<Movie>list= new ArrayList<>();
        for(Movie m : Database.provide()) {
            if (m.getReleaseYear() >= 2000 && m.getReleaseYear() <= 2015) ;
            list.add(m);
            return list;
        }
        return null;

    }

    private static List<Movie> searchByDirector(String director ) {
       // return Database.provide().stream().filter(d->d.getDirector().equalsIgnoreCase(director)).collect(Collectors.toList());
List<Movie> list = new ArrayList<>();
for(Movie m: Database.provide())if(m.getDirector().length()>=3 && m.getDirector()
        .contains(director))list.add(m);
return list;
    }

    private static void print(List<Movie>movies){
       // int num= 1;
       // for(Movie m: movies) {
          //  System.out.println(num + ") " + m);
          //  num++;
       // }
        movies.forEach(System.out::println);
    }

    private static List<Movie> searchByGenre(String genre) {
        //ArrayList<Movie> list = new ArrayList<>();
       // for (Movie m : Database.provide())
          //  if (m.getGenre().equalsIgnoreCase(genre)) list.add(m);
        //return list;
        return Database.provide().stream()
                .filter(m->m.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}
