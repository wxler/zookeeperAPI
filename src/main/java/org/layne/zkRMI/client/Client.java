package org.layne.zkRMI.client;

import org.layne.zkRMI.common.HelloService;

public class Client {

    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();
        while (true) {
            HelloService helloService = consumer.lookup();
            String result = helloService.sayHello("layne");
            System.out.println("client:"+result);
            Thread.sleep(3000);
        }
    }
}