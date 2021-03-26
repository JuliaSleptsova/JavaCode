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
}