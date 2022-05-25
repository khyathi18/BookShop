package JFS.BookShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBook {

	public int bookId;
	
	@Autowired
	public BookList booklist;
	
	//@Value("#{booklist.author?.toUpperCase()}")
	//public String publisher;
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public BookList getBooklist() {
		return booklist;
	}

	public void setBooklist(BookList booklist) {
		this.booklist = booklist;
	}

	public void show() {
		System.out.println("My Book Class method");
		//System.out.println("Publisher Name"+publisher);
		booklist.myfavbook();
		System.out.println(booklist);
	}
}
