package com.virtualpairprogrammers.avalon.services;

public class PurchasingServiceImpl implements PurchasingService {

	private AccountService accountService;
	private BookService bookService;

	// -- constructors

	// --- spring: inject services in constructor instead of using setters
	public PurchasingServiceImpl(AccountService accountService, BookService bookService) {
		super();
		this.accountService = accountService;
		this.bookService = bookService;
	}

	// -- business methods

	public void buyBook(String isbn) {
		if (bookService != null && accountService != null)
			accountService.raiseInvoice(bookService.getBookByIsbn(isbn));
	}

}
