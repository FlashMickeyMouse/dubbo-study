package kingsman.xin.dubbo4_spring_ann;

import kingsman.xin.dubbo4_spring_ann.provider.Dubbo4ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:03
 **/
public class TestProviderModule4 {
    public static void main(String[] args) throws IOException {

        start();
        System.in.read();

    }

    public static void start() {
        new AnnotationConfigApplicationContext(Dubbo4ProviderConfiguration.class);

    }


}
