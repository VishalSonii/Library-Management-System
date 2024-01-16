package com.mehmetpekdemir.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.mehmetpekdemir.librarymanagementsystem.entity.Author;
import com.mehmetpekdemir.librarymanagementsystem.entity.Book;
import com.mehmetpekdemir.librarymanagementsystem.entity.Category;
import com.mehmetpekdemir.librarymanagementsystem.entity.Publisher;
import com.mehmetpekdemir.librarymanagementsystem.service.BookService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {

			Book book = new Book("978-1-78280-808-4", "The Complete Reference C++", "Fourth Edition", "Covers the International Standard for C++ including keywords, syntax and libraries");
			Author author = new Author("Herbert Schildt", "The world's leading programming author with more than 3 million books sold !");
			Category category = new Category("Programming C++");
			Publisher publisher = new Publisher("Mc Graw Hill Eductaion");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			/*Book book = new Book("Test isbn", "Test name", "Test serial name", "Test description");
			Author author = new Author("Test author name", "Test description");
			Category category = new Category("Test category name");
			Publisher publisher = new Publisher("Test publisher name");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);*/

			Book book1 = new Book("78280-8081-978-1", "Python Programming", "Third Edition", "The ultimate guide from beginner to expert");
			Author author1 = new Author("Clive Cambell", "Best programmer");
			Category category1 = new Category("Programming Python");
			Publisher publisher1 = new Publisher("Independent Publisher");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			/*Book book1 = new Book("Test isbn1", "Test name1", "Test serial name1", "Test description1");
			Author author1 = new Author("Test author name1", "Test description1");
			Category category1 = new Category("Test category name1");
			Publisher publisher1 = new Publisher("Test publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);*/

			/*Book book2 = new Book("Test isbn2", "Test name2", "Test serial name2", "Test description2");
			Author author2 = new Author("Test author name2", "Test description2");
			Category category2 = new Category("Test category name2");
			Publisher publisher2 = new Publisher("Test publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);*/



			/*Book book = new Book("978-1-78280-808-4", "The Complete Reference C++", "Fourth Edition", "Covers the International Standard for C++ including keywords, syntax and libraries");
			Author author = new Author("Herbert Schildt", "The world's leading programming author with more than 3 million books sold !");
			Category category = new Category("Programming");
			Publisher publisher = new Publisher("Mc Graw Hill Eductaion");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("78280-8081-978-1", "Python Programming", "Third Edition", "The ultimate guide from beginner to expert");
			Author author1 = new Author("Clive Cambell", "Best programmer");
			Category category1 = new Category("Programming");
			Publisher publisher1 = new Publisher("Independent Publisher");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);*/

			Book book2 = new Book("8328-38-930-6", "Mathematics", "Eighth Edition", "The revised edition of the book Mathematics for class X");
			Author author2 = new Author("R.D. Sharma", "Working as Professor and head of Department of Sciences and Humanities");
			Category category2 = new Category("Advanced Level Questions");
			Publisher publisher2 = new Publisher("Dhanpat Rai Publication");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

			Book book3 = new Book("8118-18-9090-7", "Science", "DIGI Smart Books", "The revised edition of the book Science for class X");
			Author author3 = new Author("Dr. K.J. Prakash", "Working as Chemistry Professor");
			Category category3 = new Category("Important Information");
			Publisher publisher3 = new Publisher("Goyal Brother Prakashan");

			book3.addAuthors(author3);
			book3.addCategories(category3);
			book3.addPublishers(publisher3);

			bookService.createBook(book3);

		};
	}
}
