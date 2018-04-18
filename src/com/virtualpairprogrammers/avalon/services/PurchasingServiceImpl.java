package com.virtualpairprogrammers.avalon.services;

public class PurchasingServiceImpl implements PurchasingService {

	private AccountService accountService;
	private BookService bookService;

	
	// -- preconditions: inject services
	
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	// -- business methods
	
	public void buyBook(String isbn) {
		if (bookService != null && accountService != null)
			accountService.raiseInvoice(bookService.getBookByIsbn(isbn));
	}

}
