package com.java.althgriom.st;

/***
 * 二叉查找树
 */
public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node{
        private Key key;
        private Value value;
        private Node left, right;
        private Integer N;

        public Node(Key key, Value value, Integer N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }

        public int size() {
            return size(root);
        }

        private int size(Node node) {
            if (node == null) return 0;
            else return node.N;
        }

        public Value get(Key key) {
            return get(root, key);
        }

        private Value get(Node x, Key key) {
            if (x == null) return null;

            int cmp = key.compareTo(key);
            if (cmp < 0) return get(x.left, key);
            else if (cmp > 0) return get(x.right, key);
            else return x.value;
        }

        public void put(Key key, Value value) {
            root = put(root, key, value);
        }

        /***
         * 如果key存在x子树中，则更新；
         * 如果不存在x子树中，则创建新的元素
         * @param x
         * @param key
         * @param value
         * @return
         */
        private Node put(Node x, Key key, Value value) {
            if (x == null) return new Node(key, value, 1);
            int cmp = key.compareTo(key);
            if (cmp < 0) x.left = put(x.left, key, value);
            else if (cmp > 0) x.right = put(x.right, key, value);
            else x.value = value;
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

//        public Value max(){
//
//        }
//
//        public Value min() {
//
//        }



    }

}
