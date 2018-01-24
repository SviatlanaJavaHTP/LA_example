package by.htp.library.action.console;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.action.BaseAction;
import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.db.BookMySqlDaoImpl;
import by.htp.library.dao.file.BookFileDaoImpl;

public class ViewBookListImpl implements BaseAction{
	
	//IoC
	//private BookDao dao = new BookMySqlDaoImpl();
	private BookDao dao = new BookFileDaoImpl();

	@Override
	public void doSmth() {
		
		List<Book> books = dao.readAll();
		
		for(Book book: books){
			System.out.println(book);
		}
		
	}

}
