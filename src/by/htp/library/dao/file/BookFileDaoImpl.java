package by.htp.library.dao.file;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class BookFileDaoImpl implements BookDao {

	@Override
	public void create(Book t) {
		throw new UnsupportedOperationException("method was not implemented");
	}

	@Override
	public Book read() {
		throw new UnsupportedOperationException("method was not implemented");
	}

	@Override
	public void update(Book t) {
		throw new UnsupportedOperationException("method was not implemented");
	}

	@Override
	public void delete(Book t) {
		throw new UnsupportedOperationException("method was not implemented");
	}

	@Override
	public List<Book> readAll() {
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(1));
		books.add(new Book(2));
		books.add(new Book(3));
		
		return books;
	}

}
