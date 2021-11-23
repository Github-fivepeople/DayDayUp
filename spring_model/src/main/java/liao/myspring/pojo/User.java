package liao.myspring.pojo;

import org.springframework.stereotype.Component;

/*组件: 等价于 xml配置文件中 <bean id="user" class="liao.myspring.pojo.User"/>  */
@Component
public class User {
    public String name = "小满";

}
