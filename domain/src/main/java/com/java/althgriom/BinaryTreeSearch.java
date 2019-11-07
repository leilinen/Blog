package com.java.althgriom;

public class BinaryTreeSearch {

    public static int binarySearch(int[] arrs, int key) {
        int low = arrs[0];
        int high = arrs[arrs.length -1];
        while (low <= high) {
            int mid = (high - low) /2;
            if (arrs[mid] < key) {
                low = mid + 1;            //todo 注意这里是根据mid移动的
            }else if (arrs[mid] > key) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        System.out.println(binarySearch(arrs, key));
    }
}
