package kingsman.xin.dubbo6_nacos;

import kingsman.xin.dubbo6_nacos.provider.Dubbo6ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:03
 **/
public class TestProviderModule6 {
    public static void main(String[] args) throws IOException {

        start();
        System.in.read();

    }

    public static void start() {
        new AnnotationConfigApplicationContext(Dubbo6ProviderConfiguration.class);

    }


}
