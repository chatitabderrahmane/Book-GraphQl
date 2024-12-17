package ma.abderrahmanechatit.controlegraphql.service;

import lombok.AllArgsConstructor;
import ma.abderrahmanechatit.controlegraphql.dao.entities.Book;
import ma.abderrahmanechatit.controlegraphql.dao.repositories.BookRepository;
import ma.abderrahmanechatit.controlegraphql.dto.BookDTO;
import ma.abderrahmanechatit.controlegraphql.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class BookManager implements BookService{

    private BookRepository bookRepository;
    private BookMapper bookMapper;



    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = bookMapper.fromBookDtoToBook(bookDTO);
        book =  bookRepository.save(book);
        bookDTO = bookMapper.fromBookToBookDto(book);
        return bookDTO;

     }


    @Override
    public List<BookDTO> getBookByTitre(String titre) {
        List<Book> books = bookRepository.findByTitre(titre);
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (Book book : books) {
            bookDTOS.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDTOS;    }


}
