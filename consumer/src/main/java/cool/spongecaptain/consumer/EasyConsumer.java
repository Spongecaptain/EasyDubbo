package cool.spongecaptain.consumer;


import cool.spongecaptain.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EasyConsumer {
    public static void main(String[] args) {
        //这里我们利用 Spring IoC 容器的方式来加载
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService"); // 获取远程服务代理

        //这里我们执行 RPC 调用 10 次
        for (int i = 0; i < 10; i++) {
            if(null!=helloService){
                long startTime = System.currentTimeMillis();
                String hello = helloService.sayHello("Spongecaptain"); // 执行远程方法
                long endTime = System.currentTimeMillis();
                long timeConsuming = endTime - startTime;
                System.out.println( hello );
                System.out.println("耗时："+timeConsuming + " ms");
            }
        }
    }

}
