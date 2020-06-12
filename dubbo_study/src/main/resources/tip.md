## dubbo标签的service与provider、reference与consumer的区别

**<dubbo:service与<dubbo:provider是同一个级别的。
provider是原始的服务提供方式：配置参数超级多，比较繁琐，学习成本大
service是在provider的基础上给了很多默认值，用户使用时只需配置少量必需的值，大大降低学习成本。
可以看做service是provider的一种包装
reference与consumer同理。**
