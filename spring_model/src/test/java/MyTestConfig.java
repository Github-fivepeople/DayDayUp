import com.xia.pojo.HelloT;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beansconfig = new ClassPathXmlApplicationContext("beansconfig.xml");

        HelloT hello = (HelloT) beansconfig.getBean("hello");
        HelloT hello1 = (HelloT) beansconfig.getBean("K");
        hello.show();
        hello1.show();
    }
}
