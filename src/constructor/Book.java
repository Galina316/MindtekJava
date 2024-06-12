package constructor;

public class Book {
    String tittle;
    int pages;
    String author;
     public Book(String tittle,int pages,String author){
         this.tittle = tittle;
         this.pages = pages;
         this.author = author;
     }
     public Book(String tittle){
         this.tittle=tittle;

     }
     public Book(int pages){
         this.pages=pages;
     }
     public Book(){

     }
}
