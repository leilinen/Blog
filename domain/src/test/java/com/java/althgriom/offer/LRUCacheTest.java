package com.java.althgriom.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class LRUCacheTest {

    @Test
    public void lruCacheTest() {

        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(cache.get(1), 1);       // 返回  1

        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        Assert.assertEquals(cache.get(2), -1);       // 返回 -1 (未找到)

        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        Assert.assertEquals(cache.get(1), -1);       // 返回 -1 (未找到)

        Assert.assertEquals(cache.get(3), 3);       // 返回  3

        Assert.assertEquals(cache.get(4), 4);       // 返回  4

    }

}