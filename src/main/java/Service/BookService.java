package Service;

import Repository.BookRepository;
import model.Book;

public class BookService {


    private final BookRepository bookRepository = new BookRepository();
    public boolean addBook(Book book){
      if  (!bookRepository.save(book)){
          return false;
      }
      return true;

    }

    public boolean removeBook(String title) {


     Book findBook=  bookRepository.finByTitle(title);

     if(findBook==null) {
         return false;
     }
     bookRepository.removeByTitle(findBook);



    return true ;
    }
}
