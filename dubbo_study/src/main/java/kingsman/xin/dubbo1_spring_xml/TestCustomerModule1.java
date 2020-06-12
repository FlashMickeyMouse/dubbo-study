package kingsman.xin.dubbo1_spring_xml;

import kingsman.xin.standardservice.SayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 08:33
 **/
public class TestCustomerModule1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:dubbo1/consumer.xml");
        SayService sayService = (SayService) classPathXmlApplicationContext.getBean("sayService");
        System.out.println(sayService.sayHello());
    }


}
