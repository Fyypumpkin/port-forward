package cn.fyypumpkin.port.proxy;

import cn.fyypumpkin.port.Utils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/**
 * @author fyypumpkin on 2018/10/26
 */
public class ProxyWrite {
    private ByteBuffer buffer;

    public ProxyWrite(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    public void handleWrite(SelectionKey key, int count) throws IOException {
        key.interestOps(SelectionKey.OP_WRITE);
        buffer.flip();
        SocketChannel channel = (SocketChannel) key.channel();
        while (buffer.hasRemaining()) {
            channel.write(buffer);
            Utils.print("message send to：", channel.getRemoteAddress() + " " + key.attachment() + " " + count + " bytes");
        }
        buffer.clear();
        key.interestOps(SelectionKey.OP_READ);
    }
}
