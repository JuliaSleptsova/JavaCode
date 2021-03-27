package com.belkacoder.BinarySearch;

public class Solution {
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchBinary(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static int mySqrt(int x) {
        long left = 1, right = x / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == x) return (int)mid;
            if (mid * mid > x) right = mid - 1;
            else left = mid + 1;
        }
        if (left * left == x) return (int) left;
        return (int)right;
    }

    public static int guessNumber(int n) {
        int mid, left = 0, right = n;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid == n) return mid;
            if (n < mid) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

}
