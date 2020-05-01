package com.java.althgriom.st;


/***
 * 基于无序链表的符号表
 * @param <Key>
 * @param <Value>
 */
public class SequentialSearchST<Key, Value> implements ST<Key, Value> {


    private Node first;
    private Integer size;

    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    @Override
    public Value get(Key key) {
        for (Node x = first; x!= null; x = x.next) {
            if (x.key.equals(key)) {
                return x.val;
            }
        }

        return null;
    }

    @Override
    public void put(Key key, Value value) {
        for (Node x = first; x!= null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = value;
                return;
            }
        }

        first = new Node(key, value, first);
        size ++;

    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean contain(Key key) {
        for (Node x = first; x!=null; x = x.next) {
            if (key.equals(x.key)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Key min() {
        return null;
    }

    @Override
    public Key max() {
        return null;
    }

    @Override
    public Key floor(Key key) {
        return null;
    }

    @Override
    public Key ceiling(Key key) {
        return null;
    }

    @Override
    public int rank(Key key) {
        return 0;
    }

    @Override
    public Key select(int k) {
        return null;
    }

    @Override
    public void deleteMin() {
        delete(min());
    }

    @Override
    public void deleteMax() {
        delete(max());
    }

    @Override
    public int size(Key lo, Key hi) {
        return 0;
    }

    @Override
    public Iterable<Key> Keys(Key lo, Key hi) {
        return null;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }
}
