package com.virtualpairprogrammers.avalon.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.avalon.services.PurchasingService;

public class Client {
	public static void main(String[] args) {
		String configFile = "application.xml";
		String isbn = "ISBN1";   // available in mocked bookService
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext(configFile);
		// BookService bookService = container.getBean(BookService.class);
		// AccountService accountService = container.getBean(AccountService.class);
		PurchasingService purchasing = container.getBean(PurchasingService.class);
		//
		// List<Book> allBooks = bookService.getEntireCatalogue();
		// for (Book next : allBooks) {
		// System.out.println(next);
		// }
		//

		// -- test
		purchasing.buyBook(isbn);
		
		container.close();

	}
}
