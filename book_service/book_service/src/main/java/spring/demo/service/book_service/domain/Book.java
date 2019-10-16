package spring.demo.service.book_service.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private String id;
	private String title;
	private String author;
	private double price;
	private String language;
	private String ISN;
	
	public Book(String id, String title, String author, double price, String language, String ISN) {
	
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.language = language;
		this.ISN = ISN;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public String getLanguage() {
		return language;
	}

	public String getISN() {
		return ISN;
	}

	public Book() {
		super();
	}
	
	
}
