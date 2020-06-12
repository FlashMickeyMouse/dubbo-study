package kingsman.xin.dubbo2_javaapi;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import kingsman.xin.standardservice.SayService;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 08:33
 **/
public class TestCustomerModule2 {
    public static void main(String[] args) {
        callRemoteFun("dubbo://192.168.95.1:20880/kingsman.xin.standardservice.SayService");
    }

    public static void callRemoteFun(String url) {
        ReferenceConfig referenceConfig = new ReferenceConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig("customer");
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setInterface(SayService.class);

        //直连 并且url中包含了协议类型
        referenceConfig.setUrl(url);

        SayService sayService = (SayService) referenceConfig.get();
        System.out.println(sayService.sayHello());
    }


}
