package kingsman.xin.dubbo6_nacos.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import kingsman.xin.standardservice.SayService;
import org.springframework.stereotype.Service;


/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:12
 **/
@Service
public class AIService {

    @Reference
    private SayService sayService;

    public void AISayHello() {
        System.out.println(sayService.sayHello());
    }
}
