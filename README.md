# Guard: distributed lock

```java
package test;

import cn.edu.ycu.guard.DistributedLock;

public class Demo {
    public static void main(String[] args) {

        try (DistributedLock lock = new DistributedLock(null)) {

            lock.lock();

            // you service
            System.out.println(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
```