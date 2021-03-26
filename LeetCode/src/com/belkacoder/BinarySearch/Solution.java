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
        int mid, left = 0, right = x;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (right - left == 1) return left;
            if (mid * mid > x) right = mid;
            else left = mid ;
        }
        return -1;
    }
}
