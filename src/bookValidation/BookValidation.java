package bookValidation;

import java.util.regex.Pattern;

public class BookValidation 
{
	public static boolean verifyBookTitle(String bookTitle)
	{
		boolean status = Pattern.compile("[A-Za-z ]+").matcher(bookTitle).matches();
		return status;
	}
}
