package cn.fyypumpkin.port.command;

import cn.fyypumpkin.port.proxy.Proxy;

import java.util.Scanner;

/**
 * @author fyypumpkin on 2018/10/26
 */
public class CommandThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input remote ip：");
        String targetIp = scanner.next();
        System.out.println("input remote port：");
        Integer targetPort = scanner.nextInt();
        System.out.println("input local listen port：");
        Integer listenPort = scanner.nextInt();

        new Proxy.Builder().setTargetIp(targetIp).setTargetPort(targetPort).setListenPort(listenPort).build().run();

    }
}
