package com.capgemini.sfdc.ex;

public class ProductIsNotAvailable extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProductIsNotAvailable() {
		super();
	}
public ProductIsNotAvailable(String message) {
	super(message);
}
}
