package ma.abderrahmanechatit.controlegraphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Book {
    @Id
    @GeneratedValue
    Long id_Book;
    String titre;
    String publisher;
    Date datePublication;
    double price;
    String resume;
}




