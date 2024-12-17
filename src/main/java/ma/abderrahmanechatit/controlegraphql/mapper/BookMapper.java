package ma.abderrahmanechatit.controlegraphql.mapper;

import ma.abderrahmanechatit.controlegraphql.dao.entities.Book;
import ma.abderrahmanechatit.controlegraphql.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook(BookDTO bookDto){
        return mapper.map(bookDto, Book.class);
    }

    public BookDTO fromBookToBookDto(Book book){
        return mapper.map(book, BookDTO.class);
    }

}
