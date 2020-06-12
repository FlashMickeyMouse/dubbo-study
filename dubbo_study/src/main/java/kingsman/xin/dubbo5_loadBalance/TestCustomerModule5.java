package kingsman.xin.dubbo5_loadBalance;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import kingsman.xin.standardservice.SayService;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-10 08:33
 **/
public class TestCustomerModule5 {
    public static void main(String[] args) {
        callRemoteFun();
    }

    public static void callRemoteFun() {
        ReferenceConfig referenceConfig = new ReferenceConfig();
        ApplicationConfig applicationConfig = new ApplicationConfig("customer");
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setInterface(SayService.class);

        //直连 并且url中包含了协议类型
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://10.0.255.220:2181"));

        SayService sayService = (SayService) referenceConfig.get();

        for (; ; ) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sayService.sayHello());
        }
    }


}
