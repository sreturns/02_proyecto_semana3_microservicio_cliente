package com.sinensia.service;

import java.util.List;
import java.util.Optional;

import com.sinensia.model.BookCopy;

/**
 * Interfaz que implementaremos en nuestra clase BookCopyServiceImpl
 * 
 * @see com.sinensia.service.BookCopyServiceImpl
 */
public interface BookCopyService {

	List<BookCopy> getAll();

	void save(BookCopy bookCopy);

	void update(BookCopy bookCopy);

	Optional<BookCopy> getItemById(int isbn);

	List<BookCopy> delete(int isbn);

}
