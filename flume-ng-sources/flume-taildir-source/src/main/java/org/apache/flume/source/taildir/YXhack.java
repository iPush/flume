package org.apache.flume.source.taildir;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by yixin on 11/13/15.
 */
/*
 *    临时的修改,非常恶心,期待尽快出日志规范
 *    主要的功能
 *    将日志转换成 json ,
 *    {
 *      "ip": "127.0.0.1",
 *      "path": "/var/log/something.log",
 *
 *      "message": "xxxxxx"
 *    }

 */
public class YXhack {
    private static String ip = null;

    public static String getIp() {
        if ( ip == null || ip == "") {
            YXhack.setIp(YXhack.getHostIp());
        }
        return ip;
    }

    public static void setIp(String ip) {
        YXhack.ip = ip;
    }

    public static String getHostIp() {
        String ip = null;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            ip = addr.getHostAddress();
        } catch (UnknownHostException e) {
            // eat it
        } finally {
            return ip;
        }
    }

}
