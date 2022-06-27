package com.java.zookeeper.lock;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessLock;
import org.apache.curator.framework.recipes.locks.InterProcessMultiLock;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2022-06-19
 */
public class DistributedLock {

    private Logger logger = LoggerFactory.getLogger(DistributedLock.class);

    private static final String zkAddr = "127.0.0.1:2181";
    private static final int timeout = 6000;
    private static final String LOCKER_ROOT = "/locker";

    private CuratorFramework cf;

    public void init() {
        this.cf = CuratorFrameworkFactory.builder()
                .connectString(zkAddr)
                .sessionTimeoutMs(timeout)
                .retryPolicy(new ExponentialBackoffRetry(1000, 3))
                .build();
        this.cf.start();
    }

    public void lock(String key, Runnable command) {
        String path = LOCKER_ROOT + "/" + key;
        InterProcessLock lock = new InterProcessMutex(this.cf, path);
        try {
            lock.acquire();
            command.run();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                lock.release();
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }

        }
    }
}
