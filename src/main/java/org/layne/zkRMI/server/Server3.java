package org.layne.zkRMI.server;

import org.layne.zkRMI.common.HelloService;

import java.rmi.RemoteException;

/** 本机上相当于有三个IP，相当于有三台服务器
 *  VMnet1:192.168.40.1
 *  VMnet8:192.168.218.1
 *  locahost:127.0.0.1
 */
public class Server3 {

    public static void main(String[] args) throws RemoteException {
        // 当前rmi服务器的ip 和端口
        String host = "127.0.0.1";
        int port = Integer.parseInt("11218");
        HelloService helloService = new HelloServiceImpl();
        ServiceProvider provider = new ServiceProvider();

        provider.publish(helloService, host, port);
        System.out.println(String.format("服务端启动了%s:%d",host,port));


    }
}
