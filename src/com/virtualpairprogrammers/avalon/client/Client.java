package com.virtualpairprogrammers.avalon.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.avalon.domain.Book;
import com.virtualpairprogrammers.avalon.services.BookService;
import com.virtualpairprogrammers.avalon.services.BookServiceMockImpl;

public class Client {
	public static void main(String[] args) {
		String configFile = "application.xml";
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(configFile);

		BookService bserv = container.getBean(BookService.class);

		List<Book> allBooks = bserv.getEntireCatalogue();

		for (Book next : allBooks) {
			System.out.println(next);
		}

		container.close();

	}
}
