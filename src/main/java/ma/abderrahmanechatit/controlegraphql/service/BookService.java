package ma.abderrahmanechatit.controlegraphql.service;

import ma.abderrahmanechatit.controlegraphql.dto.BookDTO;

import java.util.List;

public interface BookService {
    public BookDTO saveBook(BookDTO bookDto);


    public List<BookDTO> getBookByTitre(String titre);


}

