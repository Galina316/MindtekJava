package moviesapp;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Website1 {
    Website scan=new Website();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Search by: \n 1 Genre \n 2 Director\n 3 Year\n 4 For children");
            System.out.println("Enter 5 for Exit");
            String num = in.next();

        }
        while(in.equals("5"));
        if(in.equals("1")){
            String genre = "";
            System.out.println(searchByGenre(genre));
        }


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
