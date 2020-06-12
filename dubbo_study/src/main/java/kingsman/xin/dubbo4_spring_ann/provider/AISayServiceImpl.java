package kingsman.xin.dubbo4_spring_ann.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import kingsman.xin.standardservice.SayService;

/**
 * @program: dubbo_study
 * @description:
 * @author: songhao
 * @create: 2020-06-09 18:10
 **/
@Service
public class AISayServiceImpl implements SayService {
    @Override
    public String sayHello() {
        return "hello !"+ RpcContext.getContext().getLocalAddressString();
    }
}
