package kingsman.xin.dubbo5_loadBalance;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import kingsman.xin.provider.MySayService;
import kingsman.xin.standardservice.SayService;

import java.io.IOException;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:03
 **/
public class TestProviderModule5 {
    public static void main(String[] args) throws IOException {
        //-1 是自增
        start((short) -1);
        System.in.read();

    }

    public static void start(short port) {
        //服务端总配置
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setLoadbalance("roundrobin");


        //应用信息配置
        ApplicationConfig applicationConfig = new ApplicationConfig("provider");
        serviceConfig.setApplication(applicationConfig);


        //协议配置 不配置的话默认是20880
        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo", port);
        serviceConfig.setProtocol(protocolConfig);


        //注册中心  直连方式
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://10.0.255.220:2181");
        serviceConfig.setRegistry(registryConfig);


        //设置服务
        serviceConfig.setInterface(SayService.class);
        serviceConfig.setRef(new MySayService());

        serviceConfig.export();

        System.out.println("服务启动" + serviceConfig.getExportedUrls().get(0));
    }


}
