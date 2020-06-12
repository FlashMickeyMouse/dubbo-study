package kingsman.xin.dubbo6_nacos;

import kingsman.xin.dubbo6_nacos.consumer.AIService;
import kingsman.xin.dubbo6_nacos.consumer.Dubbo6ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 08:33
 **/
public class TestCustomerModule6 {
    public static void main(String[] args) {
        callRemoteFun();
    }

    public static void callRemoteFun() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Dubbo6ConsumerConfiguration.class);
        AIService aiService = annotationConfigApplicationContext.getBean("AIService", AIService.class);
        for(;;){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aiService.AISayHello();
        }

    }


}
