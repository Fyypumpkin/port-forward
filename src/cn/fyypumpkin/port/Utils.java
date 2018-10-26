package cn.fyypumpkin.port;

import java.nio.charset.Charset;

/**
 * @author fyypumpkin on 2018/10/26
 */
public class Utils {
    public static void print(Object left, Object right) {
        String format = "%-" + (20 - left.toString().length()) + "s";
        System.out.printf(format, new String(left.toString().getBytes(), Charset.forName("utf-8")));
        System.out.println(new String(right.toString().getBytes(), Charset.forName("utf-8")));
    }
}