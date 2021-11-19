import com.xia.pojo.autowired.People;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired_BeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowired_beans.xml");

        //Bean的显示装配 - 在xml配置文件中定义Bean
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();

        People people2 = context.getBean("people2", People.class);
        people2.getCat().shout();
        people2.getDog().shout();


    }
}
