package cn.edu.ycu.guard;

import java.io.Serializable;

/**
 * @author <a href="mailto:wangruihuano@gmail.com">王瑞环</a>
 * @since 2019-03-25 17:59
 */
public interface LockGenerater<T extends Serializable> {

    DistributedLock<T> GenerateLock(T sign);
}
