package spring.demo.service.book_service.application;

import spring.demo.service.book_service.infrastructure.persistence.BookRepository;
import spring.demo.service.book_service.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks()
	{
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	public Optional getBook(String id)
	{
		 return bookRepository.findById(id);
	}
	
	public void addBook(Book newBook)
	{
		bookRepository.save(newBook);
	}
	
	public void updateBook(String id , Book updatedBook)
	{
		bookRepository.save(updatedBook);
	}
	
	public void deleteBook(String id)
	{
		bookRepository.deleteById(id);
	}
	

}
