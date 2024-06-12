package constructor;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("OCA",500,"James Boyarsky");
        Book book2 = new Book("10x Rules",100,"Grand Cardone");
        Book book3 = new Book("War & Peace");
        Book book4 = new Book(250);
        Book book5 = new Book();

        Book[]books ={book1,book2,book3,book4,book5};

        for(Book b : books){
            if(b.pages>200) System.out.println(b.tittle);
        }
        // print authors that has book title as null
        for (Book b : books){
            if(b.tittle!=null) System.out.println(b.author);
        }
        // print total pages for all books that has tittle
        int sum = 0;
        for(Book b: books){
            if (b.tittle!=null) sum+=b.pages;

        }System.out.println(sum);

    }
}
