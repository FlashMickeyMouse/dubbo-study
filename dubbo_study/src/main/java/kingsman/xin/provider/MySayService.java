package kingsman.xin.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import kingsman.xin.standardservice.SayService;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:10
 **/
public class MySayService implements SayService {
    @Override
    public String sayHello() {
        return "hello !"+ RpcContext.getContext().getLocalAddressString();
    }
}
