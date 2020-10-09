package cool.spongecaptain.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class EasyProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        try {
            System.in.read(); // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
