package spring.demo.service.book_service.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.demo.service.book_service.domain.Book;


@Repository
public interface BookRepository extends  CrudRepository<Book, String> {

}
