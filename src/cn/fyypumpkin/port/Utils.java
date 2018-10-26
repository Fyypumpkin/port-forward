package cn.fyypumpkin.port;

import java.nio.channels.SocketChannel;

/**
 * @author fyypumpkin on 2018/10/26
 */
public class Utils {
    public static void print(Object left, Object right) {
        String format = "%-" + (20 - left.toString().length()) + "s";
        System.out.printf(format, left);
        System.out.println(right);
    }
}
