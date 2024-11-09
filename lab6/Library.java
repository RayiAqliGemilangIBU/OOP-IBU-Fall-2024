package lab6;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public void addBook(Book newBook){
        library.add(newBook);
    }

    public void printBooks(){
        for(Book book : library){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle (String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : library){
                      /*  if(b.title().equals(title)){
                found.add(b);
            }*/

            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }

        }
        return found;
    }

}
