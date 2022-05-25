package JFS.BookShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	MyBook obj=context.getBean(MyBook.class);
    	obj.show();
    	//BookList booklist=context.getBean(BookList.class);
    //	System.out.println(booklist);
    }
}
