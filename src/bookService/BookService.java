package bookService;

import bookInterface.BookInterface;
import bookInterfaceImp.BookInterfaceImp;

public class BookService 
{
	public static BookInterface getBookDAO()
	{
		BookInterface dao=new BookInterfaceImp();
		return dao;
	}
}
