package pl.skapustka.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String lastName;
	private String firstName;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Book> books = new HashSet<>();

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	Set<Book> getBooks() {
		return books;
	}

	void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Author() {
		super();
	}

	public Author(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Author(String lastName, String firstName, Set<Book> books) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.books = books;
	}

	

}
