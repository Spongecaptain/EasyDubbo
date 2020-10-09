package cool.spongecaptain.service.impl;

import cool.spongecaptain.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("get a RPC Call!");
        return "Hello! " + name;
    }
}
