package bookService;

import bookDAOImp.BookDAOImp;
import bookDao.BookDAO;

public class BookService 
{
	public static BookDAO getBookDAO()
	{
		BookDAO dao=new BookDAOImp();
		return dao;
	}
}
