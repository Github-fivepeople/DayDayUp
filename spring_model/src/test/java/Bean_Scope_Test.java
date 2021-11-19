import com.xia.pojo.CP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_Scope_Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_scope.xml");
        CP cp2 = context.getBean("cp2", CP.class);
        CP cp2pro = context.getBean("cp2", CP.class);
        System.out.println(cp2 == cp2pro);
    }
}
