package kingsman.xin.dubbo4_spring_ann;

import kingsman.xin.dubbo4_spring_ann.consumer.AIService;
import kingsman.xin.dubbo4_spring_ann.consumer.Dubbo4ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 08:33
 **/
public class TestCustomerModule4 {
    public static void main(String[] args) {
        callRemoteFun();
    }

    public static void callRemoteFun() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Dubbo4ConsumerConfiguration.class);
        AIService aiService = annotationConfigApplicationContext.getBean("AIService", AIService.class);
        aiService.AISayHello();
    }


}
