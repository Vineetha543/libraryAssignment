package bookDAOImp;

import java.util.ArrayList;

import book.Book;
import bookDao.BookDAO;


public class BookDAOImp implements BookDAO
{
	private static ArrayList<Book> bookList=new ArrayList<Book>();
	@Override
	public boolean addNewBook(Book bookObj)
	{
		boolean status = bookList.add(bookObj);
		return status;
	}
}
