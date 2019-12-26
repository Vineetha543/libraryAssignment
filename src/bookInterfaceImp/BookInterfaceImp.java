package bookInterfaceImp;

import java.util.ArrayList;

import book.Book;
import bookInterface.BookInterface;


public class BookInterfaceImp implements BookInterface
{
	
	private static ArrayList<Book> bookList=new ArrayList<Book>();
	@Override
	public boolean addNewBook(Book bookObj)
	{
		boolean status = bookList.add(bookObj);
		return status;
	}
}
