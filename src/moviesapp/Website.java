package moviesapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
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

        Scanner in = new Scanner(System.in);
        List<Movie>movies=new ArrayList<>();

        while(true){
            System.out.println("Search by: \n 1 Genre \n 2 Director\n 3 Year\n 4 For children");
            System.out.println("Enter 5 for Exit");
            int choice = in.nextInt();


            switch(choice){
                case 1:
                    System.out.println("Which genre? ");
                    String s = in.next();
                    in.nextLine();
                    movies = searchByGenre(s);
                    print(movies);


                    break;
                case 2:
                    System.out.print("Which director? ");
                    String director = in.next();
                    in.nextLine();
                    movies=searchByDirector( director);
                    print(movies);
                    break;
                case 3:
                    System.out.print("What years ? From ... To ....");
                    int year1 = in.nextInt(),year2 = in.nextInt();
                    in.nextLine();
                    movies=searchByYear(year1,year2);
                    print(movies);
                    break;
                case 4:
                    System.out.println("Movies suitable for children:");
                    in.nextLine();
                    movies=searchForChildren(movies);
                    print(movies);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        }
















     // for(Movie m : Database.provide()) System.out.println(m);
     // List<Movie> movies = searchByGenre("Crime");
       // List<Movie> movies = searchByDirector("Nolan");
       // List<Movie> movies = searchByYear(2000,2015);

      //print(movies);
    }


        private static List<Movie> searchForChildren(List<Movie> movie){

           return Database.provide().stream().filter(Movie::isForChildren).collect(Collectors.toList());
    }

    private static List<Movie> searchByYear(int year1, int year2){
//        List<Movie>list= new ArrayList<>();
//        for(Movie m : Database.provide()) {
//            if (m.getReleaseYear() >= 1970 && m.getReleaseYear() <= 2024) ;
//            list.add(m);
//            return list;
//        }
        return Database.provide().stream().filter(m -> m.getReleaseYear()>=year1 && m.getReleaseYear()<=year2).collect(Collectors.toList());

    }

    private static List<Movie> searchByDirector(String director ) {
        return Database.provide().stream().filter(d->d.getDirector().equalsIgnoreCase(director)).collect(Collectors.toList());
//List<Movie> list = new ArrayList<>();
//for(Movie m: Database.provide())if(m.getDirector().length()>=3 && m.getDirector()
//        .contains(director))list.add(m);
//return list;
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
