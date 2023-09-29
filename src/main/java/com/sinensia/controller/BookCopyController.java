package com.sinensia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.model.BookCopy;
import com.sinensia.service.BookCopyService;

/**
 * Desde nuestra clase @RestController accedemos a los metodos http
 * 
 * @author Sergio
 * @see com.sinensia.model.BookCopy
 * @see com.sinensia.service.BookCopyServiceImpl
 * @see com.sinensia.service.BookCopyService
 */
@RestController
public class BookCopyController {

	/**
	 * Inyectamos nuestro servicio
	 */
	@Autowired
	private BookCopyService service;

	/**
	 * 
	 * @return List<BookCopy>
	 */
	@GetMapping(value = "bookCopy", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookCopy> getAll() {
		return service.getAll();
	}

	/**
	 * 
	 * @param isbn
	 * @return Optional<BookCopy>
	 */
	@GetMapping(value = "bookCopy/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<BookCopy> getItemById(@PathVariable("isbn") int isbn) {
		return service.getItemById(isbn);
	}

	/**
	 * 
	 * @param bookCopy
	 */
	@PostMapping(value = "bookCopy", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody BookCopy bookCopy) {
		service.save(bookCopy);
	}

	/**
	 * 
	 * @param bookCopy
	 */
	@PutMapping(value = "bookCopy", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody BookCopy bookCopy) {
		service.update(bookCopy);
	}

	/**
	 * 
	 * @param isbn
	 * @return List<BookCopy>
	 */
	@DeleteMapping(value = "bookCopy/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookCopy> delete(@PathVariable("isbn") int isbn) {
		return service.delete(isbn);
	}
}
