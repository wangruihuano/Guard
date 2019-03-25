package cn.edu.ycu.guard;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.lang.AutoCloseable;

/**
 * @author <a href="mailto:wangruihuano@gmail.com">王瑞环</a>
 * @since 0.1
 */
public interface DistributedLock<T extends Serializable> extends Lock, AutoCloseable {


    @Override
    default void close() throws Exception {
        unlock();
    }

    T getSign();
}
