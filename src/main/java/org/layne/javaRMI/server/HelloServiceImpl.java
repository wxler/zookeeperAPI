package org.layne.javaRMI.server;

import org.layne.javaRMI.common.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {
    protected HelloServiceImpl() throws RemoteException {}
    @Override
    public String sayHello(String name) throws RemoteException {
        System.out.println("服务器端：name = "+name);//这个只会在服务器端执行和输出，客户端只会拿到返回结果
        //String.format("hello %s",name);
        return "hello "+name;
    }
}