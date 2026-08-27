package Repository;

import dto.SimpleBook;
import model.Book;

public class BookRepository {
    private final static  Book[] books = new Book [100];
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

    public Book findByTitle(String title) {

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
                    books[j]=books[j+1];

                }
                books[size-1]=null;
                size--;


            }


        }
    }

    public int getBookCount() {

        return size;
    }

    public Book[] getAllBooks(int quantity) {
        Book [] bookList = new Book[quantity];
        for (int i = 0; i < quantity; i++) {

            bookList[i]=books[i];


        }
        return bookList;
    }


    public SimpleBook [] getAllSimpleBooks(int quantity) {
        SimpleBook[] bookList = new SimpleBook[quantity];
        for (int i = 0; i < quantity; i++) {

            bookList [i] = new  SimpleBook (books[i].getTitle(), books[i].getWriterName());


        }
        return bookList;
    }


    public Book [] FindBookByWriteNames(String writerName) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if(books[i].getWriterName().equals(writerName)) {

                counter++;

            }

        }
        Book [] writerBook = new Book[counter];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(books[i].getWriterName().equals(writerName)){
                writerBook [j]=books[i];
                j++;
            }
            if(j==counter)
            {
                break;
            }

        }


        return writerBook ;

    }
}
