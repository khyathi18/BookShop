package JFS.BookShop;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class BookList {

	@Value("#{100+25}")
	public int fvbookid;
	
	@Value("Firewings")
	public String fvbookname;
	
	@Value("#{'Abdul'+' Kalam'}")
	public String author;
	
	
	 public void myfavbook()
	 {	
		 System.out.print(" my favourite book details -->\t");
	 }
	 @Override
	public String toString() {
		return "fvbookid=" + fvbookid + ", fvbookname=" + fvbookname + ", author=" + author;
	}
}
