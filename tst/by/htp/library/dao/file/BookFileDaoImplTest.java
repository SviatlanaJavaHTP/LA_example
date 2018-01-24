package by.htp.library.dao.file;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.htp.library.bean.Book;
import by.htp.library.dao.BaseDao;
import by.htp.library.dao.BookDao;

public class BookFileDaoImplTest {
	
	private BookDao dao;
	
	@Before
	public void initTestData(){
		System.out.println("Before");
		dao = new BookFileDaoImpl();
	}
	
	
	@Test
	public void testReadAllNotNull(){
		System.out.println("testReadAllNotNull");
		Assert.assertNotNull(dao.readAll());
	}
	
	@Test
	public void testReadAllNotEmpty(){	
		System.out.println("testReadAllNotEmpty");
		List<Book> books = dao.readAll();
		Assert.assertFalse(books.isEmpty());	
	}
	
	@Test
	public void testReadAllNNull1(){
		System.out.println("testReadAllNotNull1");
	}
	@Test
	public void testReadAllNotNull2(){
		System.out.println("testReadAllNotNull2");
	}

}
