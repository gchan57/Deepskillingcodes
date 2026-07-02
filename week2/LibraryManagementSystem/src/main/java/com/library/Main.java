package com.library;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static  void  main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appicationContext.xml");
        BookService service1 = context.getBean("bookService", BookService.class);
        service1.display1();
    }
}
