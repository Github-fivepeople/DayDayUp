import liao.myspring.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Liao_applicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("liao_applicationContext.xml");
        User user = context.getBean("user", User.class);

        System.out.println(user.name);

    }
}
