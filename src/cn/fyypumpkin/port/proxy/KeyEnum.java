package cn.fyypumpkin.port.proxy;

/**
 * @author fyypumpkin on 2018/10/26
 */
public enum KeyEnum {
    CLIENT("client","target_"),
    TARGET("target", "client_");

    private String name;
    private String to;

    KeyEnum(String from, String to) {
        this.name = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public String getTo() {
        return to;
    }

    public static KeyEnum nameOf(String name) {
        for (KeyEnum keyEnum : KeyEnum.values()) {
            if(keyEnum.getName().equals(name)) {
                return keyEnum;
            }
        }
        return null;
    }
}
