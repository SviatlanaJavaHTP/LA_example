package by.htp.library.dao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class BookMySqlDaoImpl implements BookDao {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";
	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true"
			+ "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false" + "&serverTimezone=UTC&useSSL=false";

	private static final String SQL_SELECT_BOOKS = "select * from book";

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
		List<Book> books = null;
		Connection con = null;
		try {
			Class.forName(DB_DRIVER);

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT_BOOKS);

			books = new ArrayList<Book>();
			Book book = null;
			while (rs.next()) {
				book = new Book();
				book.setId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				books.add(book);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

}
