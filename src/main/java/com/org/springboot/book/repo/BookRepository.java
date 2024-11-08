package com.org.springboot.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;

import com.org.springboot.book.Book;

@GraphQlRepository
public interface BookRepository extends JpaRepository<Book, Long>, QueryByExampleExecutor<Book>
{
}