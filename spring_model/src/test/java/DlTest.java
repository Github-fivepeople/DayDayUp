import com.xia.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DlTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dlbeans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
