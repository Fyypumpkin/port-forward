package cn.fyypumpkin.port;

/**
 * @author fyypumpkin on 2018/10/27
 */
public class DisplayMsg {
    private String left;

    private String right;

    public DisplayMsg(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
