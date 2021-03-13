package org.layne.zkRMI.common;

public interface ZKConstant {

    String ZK_CONNECTION_STRING = "192.168.218.52:2181,192.168.218.53:2181,192.168.218.54:2181";
    int ZK_SESSION_TIMEOUT = 5000;
    String ZK_REGISTRY_PATH = "/registry";
    String ZK_PROVIDER_PATH = ZK_REGISTRY_PATH + "/provider";
}