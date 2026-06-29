import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentTest {
    Student student;
    @Before
    public void setUp(){
        System.out.println("Setting ;)");
        student=new Student("Huna",80);
    }
    @After
    public void cleaner(){
        System.out.println("Cleand " );
        student=null;
    }
    @Test
    public void testIsPAssed(){
        boolean result=student.isPass();
        assertTrue(result);
    }
}
