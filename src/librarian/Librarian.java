package librarian;

import java.util.Scanner;

import bookInterface.BookInterface;
import bookService.BookService;
import bookValidation.BookValidation;

public class Librarian extends Thread
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		int option=0;
		do
		{
			access();
			System.out.println("press 1 to continue");
			System.out.println("press 0 to stop");
			System.out.println("Enter your option ");
			option =scan.nextInt();
		}while(option==1);
	}
	public void access()
	{
		BookInterface dao = BookService.getBookDAO();
				   System.out.println("Enter BookTitle");
			       String bookTitle;
				   boolean verificationStatus=false;
				   do
				   {
					   bookTitle=scan.next();
					   verificationStatus=BookValidation.verifyBookTitle(bookTitle);
				   }
				   while(!verificationStatus);
				   System.out.println("A book with the following title is successfully added  " +bookTitle);
				   
		}
}
