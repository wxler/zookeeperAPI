package org.layne.javaRMI.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        int port = 1099;
        String url = "rmi://localhost:1099/com.layne.javarmi.server.HelloServiceImpl";
        //创建注册服务
        LocateRegistry.createRegistry(port);
        //发布服务器，启动后不会停止，会接收多个客户端的请求，直到手动停止为止，这是异步的，不会影响下面程序的执行
        Naming.rebind(url,new HelloServiceImpl());
        System.out.println("服务器端启动了。。。");
    }
}
