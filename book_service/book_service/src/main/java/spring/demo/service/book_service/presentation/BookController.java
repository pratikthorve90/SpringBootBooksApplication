package spring.demo.service.book_service.presentation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.demo.service.book_service.application.BookService;
import spring.demo.service.book_service.domain.Book;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookservice.getAllBooks();
	}
	
	@GetMapping("books/{id}")
	public Optional getBook(@PathVariable String bookId)
	{
		return bookservice.getBook(bookId);
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book)
	{
		bookservice.addBook(book);
	}
	
	@PutMapping("/books/{id}")
	public void updateBook(@PathVariable String bookId , @RequestBody Book book )
	{
		bookservice.updateBook(bookId,book);
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable String bookId)
	{
		bookservice.deleteBook(bookId);
	}

}
