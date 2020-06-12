package kingsman.xin.dubbo6_nacos.consumer;

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
@ComponentScan(value = "kingsman.xin.dubbo6_nacos.consumer")
@EnableDubbo
@PropertySource("classpath:/dubbo6/dubbo-consumer.properties")
public class Dubbo6ConsumerConfiguration {
}
