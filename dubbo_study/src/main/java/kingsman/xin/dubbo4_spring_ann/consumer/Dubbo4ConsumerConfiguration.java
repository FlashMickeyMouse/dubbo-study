package kingsman.xin.dubbo4_spring_ann.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 13:01
 **/
@Configuration
@ComponentScan(value = "kingsman.xin.dubbo4_spring_ann.consumer")
@EnableDubbo
@PropertySource("classpath:/dubbo4/dubbo-consumer.properties")
public class Dubbo4ConsumerConfiguration {
}
