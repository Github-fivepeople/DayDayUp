import com.xia.pojo.CP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CPTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cp.xml");
        CP cp = context.getBean("cp", CP.class);
        CP cp2 = context.getBean("cp2", CP.class);
        System.out.println(cp);
        System.out.println(cp2);
    }
}

