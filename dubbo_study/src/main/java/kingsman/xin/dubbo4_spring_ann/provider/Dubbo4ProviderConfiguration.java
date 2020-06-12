package kingsman.xin.dubbo4_spring_ann.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 12:52
 **/
@Configuration
//@ComponentScan(value = "kingsman.xin.dubbo4.provider")
@EnableDubbo(scanBasePackages = "kingsman.xin.dubbo4.provider")
@PropertySource("classpath:/dubbo4/dubbo-provider.properties")
public class Dubbo4ProviderConfiguration {
}
