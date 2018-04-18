package com.virtualpairprogrammers.avalon.services;

import com.virtualpairprogrammers.avalon.domain.Book;

public class AccountServiceMockImpl implements AccountService {

	@Override
	public void raiseInvoice(Book book) {
		// TODO Auto-generated method stub
		System.out.println("Buying the book " + book);
	}

}
