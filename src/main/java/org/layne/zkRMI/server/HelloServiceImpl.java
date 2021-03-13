package org.layne.zkRMI.server;

import org.layne.zkRMI.common.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 本机上相当于有三个IP，相当于有三台服务器
 *  VMnet1:192.168.40.1
 *  VMnet8:192.168.218.1
 *  locahost:127.0.0.1
 */
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    protected HelloServiceImpl() throws RemoteException {

    }

    @Override
    public String sayHello(String name) throws RemoteException {
        String msg=String.format("Hello %s", name);
        System.out.println("服务器："+msg);//这个只会在服务器端执行和输出，客户端只会拿到返回结果
        return msg;
    }
}