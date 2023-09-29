package com.sinensia.model;

import java.util.Objects;

/**
 * 
 * @see com.sinensia.service.BookCopyService
 * @see com.sinensia.service.BookCopyServiceImpl
 */
public class BookCopy {

	private int isbn;
	private String title;
	private String theme;
	private int price;

	public BookCopy() {
	}

	/**
	 * 
	 * @param isbn
	 * @param title
	 * @param theme
	 * @param price
	 */
	public BookCopy(int isbn, String title, String theme, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.theme = theme;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn, price, theme, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookCopy other = (BookCopy) obj;
		return isbn == other.isbn && price == other.price && Objects.equals(theme, other.theme)
				&& Objects.equals(title, other.title);
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookCopy [isbn=" + isbn + ", title=" + title + ", theme=" + theme + ", price=" + price + "]";
	}

}
