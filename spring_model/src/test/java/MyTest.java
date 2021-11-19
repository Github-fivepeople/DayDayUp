import com.xia.pojo.Hello;
import com.xia.pojo.HelloT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文对象
        //ClassPathXmlApplicationContext contest = new ClassPathXmlApplicationContext("beans.xml");  //更细分的实现类
        //Spring容器相当于婚介网站, 不管你要不要去不去相亲, 相亲的对象都事先被创建, (相当于Spring容器已创建,你要用直接去取)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //现在我们的对象都在Spring中的管理,我们要使用的话 直接从容器中取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        HelloT helloT = (HelloT) context.getBean("helloT");
//        Hello hello2 = (Hello) context.getBean("hello2");
//        Hello hello3 = (Hello) context.getBean("hello3");
//        Hello hello4 = (Hello) context.getBean("hello4");
        hello.show();
        helloT.show();

        //bean的创建 默认为单例模式
        Hello hello7 = (Hello) context.getBean("hello");
        Hello hello8 = (Hello) context.getBean("hello");
        System.out.println(hello7 == hello8);

    }



}
