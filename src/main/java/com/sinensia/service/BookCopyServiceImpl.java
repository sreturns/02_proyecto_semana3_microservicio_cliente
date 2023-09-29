package com.sinensia.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sinensia.model.BookCopy;

/**
 * Nuestra clase servicio desde la cual hacemos llamadas a nuestro microservicio
 * Book, le pasamos la url en nuestro metodos y el objeto.
 * 
 * @see com.sinensia.inicio.Application
 * @see com.sinensia.service.BookCopyService
 */
@Service
public class BookCopyServiceImpl implements BookCopyService {

	/**
	 * Inyectamos el RestTemplate configurado con la anotacion @Bean a el
	 * Application.java
	 */
	@Autowired
	RestTemplate template;

	private String url = "http://localhost:8080/book";

	/**
	 * 
	 * @return List<BookCopy>
	 */
	@Override
	public List<BookCopy> getAll() {
		return Arrays.asList(template.getForObject(url, BookCopy[].class));
	}

	/**
	 * 
	 * @param bookCopy
	 */
	@Override
	public void save(BookCopy bookCopy) {
		template.postForLocation(url, bookCopy);

	}

	/**
	 * 
	 * @param bookCopy
	 */
	@Override
	public void update(BookCopy bookCopy) {
		template.put(url, bookCopy);

	}

	/**
	 * 
	 * @param isbn
	 * @return Optional<BookCopy>
	 */
	@Override
	public Optional<BookCopy> getItemById(int isbn) {
		String getItemUrl = url + "/" + isbn;

		// Hacer una solicitud GET al servicio REST con el ID proporcionado
		ResponseEntity<BookCopy> responseEntity = template.exchange(getItemUrl, HttpMethod.GET, null, BookCopy.class);

		// Verificar si la solicitud fue exitosa y devolver el resultado
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			return Optional.ofNullable(responseEntity.getBody());
		} else {
			return Optional.empty();
		}
	}

	/**
	 * 
	 * @param isbn
	 * @return List<BookCopy>
	 */
	@Override
	public List<BookCopy> delete(int isbn) {
		template.delete(url + "/" + isbn);
		return Arrays.asList(template.getForObject(url, BookCopy[].class));
	}

}
