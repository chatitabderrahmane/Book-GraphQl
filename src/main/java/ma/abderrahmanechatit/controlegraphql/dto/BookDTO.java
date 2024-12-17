package ma.abderrahmanechatit.controlegraphql.dto;


import lombok.*;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BookDTO {

    String titre;
    String publisher;
    Date datePublication;
    double price;
    String resume;
}
