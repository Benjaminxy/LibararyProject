package Service;

import Repository.BookRepository;
import dto.SimpleBook;
import model.Book;

public class BookService {


    private final static BookRepository bookRepository = new BookRepository();
    public boolean addBook(Book book){
      if  (!bookRepository.save(book)){
          return false;
      }
      return true;

    }

    public boolean removeBook(String title) {


     Book findBook=  bookRepository.findByTitle(title);

     if(findBook==null) {
         return false;
     }
     bookRepository.removeByTitle(findBook);



    return true ;
    }



    public Book [] getAllBooks() {
        int quantity = bookRepository.getBookCount();
       return bookRepository.getAllBooks (quantity) ;
    }


   public SimpleBook [] getAllSimpleBooks() {
       int quantity = bookRepository.getBookCount();
       return bookRepository.getAllSimpleBooks (quantity) ;
   }
}
