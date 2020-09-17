package com.java.althgriom.offer;

import java.util.*;

/**
 * @Description:
 * 运用你所掌握的数据结构，设计和实现一个 LRU (最近最少使用) 缓存机制。
 * 它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 *
 * 获取数据 get(key) - 如果关键字 (key) 存在于缓存中，则获取关键字的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字/值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lru-cache
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: leiline
 * @CreateTime: 2020-08-21
 */
public class LRUCache {

    // <key, [value, age]>
    private Map<Integer, List<Integer>> object;
    private List<Integer> keyLists;
    private int capacity;
    private Integer oldestKey;

    private final static Integer NOT_FOUND = -1;

    public LRUCache(int capacity) {
        this.object = new HashMap<>(capacity);
        this.capacity = capacity;
        this.keyLists = new ArrayList<>();
    }

    public int get(int key) {

        if (!keyLists.contains(key)) {
            return NOT_FOUND;
        } else {

            List<Integer> valueAndAge = this.object.get(key);
//            Integer age = valueAndAge.get(1);
//            valueAndAge.add(1, ++age);

            increaseAge(key);
            updateOldestKey();
            return valueAndAge.get(0);

        }
    }

    public void put(int key, int value) {

        List<Integer> valueAndAge = new ArrayList<>();
        valueAndAge.add(value);
        valueAndAge.add(1);

        if (this.object.size() >= capacity ) {
            this.object.remove(oldestKey);
            this.keyLists.remove(oldestKey);
        }

        this.object.put(key, valueAndAge);
        this.keyLists.add(key);

        updateOldestKey();
    }


    private void updateOldestKey() {

        Iterator<Map.Entry<Integer, List<Integer>>> iterator = this.object.entrySet().iterator();

        Integer oldestAge = 0;
        Integer oldestKey = null;

        while (iterator.hasNext()) {
            Map.Entry<Integer, List<Integer>> entry = iterator.next();
            Integer key = entry.getKey();
            List<Integer> valueAndAge = entry.getValue();

            if (oldestAge < valueAndAge.get(1)) {
                oldestAge = valueAndAge.get(1);
                oldestKey = key;
            }

        }

        this.oldestKey = oldestKey;

    }

    private void increaseAge(int except) {
        for (Integer key : keyLists) {
            if (key == except) {
                continue;
            }
            List<Integer> valueAndAge = this.object.get(key);
            Integer age = valueAndAge.get(1);
            valueAndAge.add(1, ++age);
        }
    }


}
