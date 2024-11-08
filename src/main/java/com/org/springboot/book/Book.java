package com.org.springboot.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Book
{
	@Id
	@GeneratedValue
	Long id;
	String title;
	String author;
	Integer publishedYear;

	public Book(String title, String author, Integer publishedYear)
	{
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}
}
