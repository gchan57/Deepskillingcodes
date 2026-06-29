import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
    @Test
    public void testStudent(){
        Student s=new Student("Guna",80);
        assertEquals("Guna",s.getName());
        assertTrue(s.isPass());
        assertFalse(s.getMarks()<35);
        assertNotNull(s);
        Student s2=null;
        assertNull(s2);
    }
}
