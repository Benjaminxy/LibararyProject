package Repository;

import model.Book;

public class BookRepository {
    private static  Book[] books = new Book [100];
    private  static int size;



    public boolean save(Book book) {

        for (int i = 0; i < books.length; i++) {

            if(book==null) {

               return false;
            }

            if(books[i]==null) {
                books[i]=book;
                size++;
                return true;


            }

        }
        return false ;
    }

    public Book finByTitle(String title) {

        for (int i = 0; i < books.length; i++) {

            if (books[i]!= null && books[i].getTitle().equals(title)) {
                return books[i];
            }

        }
        return null;
    }

    public void removeByTitle(Book findBook) {
        if (findBook == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }

        for (int i = 0; i < size ; i++) {
            if(books[i].equals(findBook))
            {
                for (int j = i; j < size-1 ; j++) {
                    books[i]=books[i+1];

                }
                books[size-1]=null;
                size--;


            }


        }
    }
}
