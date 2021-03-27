package com.belkacoder.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void whenTarget9Then4() {
        int[] array = new int[] {0, 1, 2, 3, 9, 11};
        int target = 9;
        int result = Solution.searchBinary(array, 9);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX4Then2() {
        int x = 4;
        int result = Solution.mySqrt(x);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX25Then5() {
        int x = 25;
        int result = Solution.mySqrt(x);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX8Then2() {
        int x = 8;
        int result = Solution.mySqrt(x);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX15Then3() {
        int x = 15;
        int result = Solution.mySqrt(x);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX29Then5() {
        int x = 29;
        int result = Solution.mySqrt(x);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2Then1() {
        int x = 2;
        int result = Solution.mySqrt(x);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

}