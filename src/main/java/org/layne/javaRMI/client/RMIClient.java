package org.layne.javaRMI.client;

import org.layne.javaRMI.common.HelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String url = "rmi://localhost:1099/com.layne.javarmi.server.HelloServiceImpl";
        //根据url寻找被注册的服务
        HelloService helloService = (HelloService) Naming.lookup(url);
        //调用服务器端的方法
        String result = helloService.sayHello("layne123");
        System.out.println("result:"+result);

    }
}
