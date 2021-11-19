import com.xia.pojo.autowired.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_BeanTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation_beans.xml");
        People people = context.getBean("people", People.class);
        people.getDog().shout();
        people.getCat().shout();

    }
}


