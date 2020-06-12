package kingsman.xin.dubbo6_nacos.provider;

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
@EnableDubbo(scanBasePackages = "kingsman.xin.dubbo6_nacos.provider")
@PropertySource("classpath:/dubbo6/dubbo-provider.properties")
public class Dubbo6ProviderConfiguration {
}
