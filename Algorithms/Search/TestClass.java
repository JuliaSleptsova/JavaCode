import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int index1 = BinarySearch.binarySearch(new int[]{1, 33, 45, 123, 897, 1002, 70009}, 70009);
        print(70009, index1);
        int index2 = LinearSearch.linSearch(new int[]{1, 45, 23, 4, 89, 8}, 4);
        print(index2, 4);

        int[] testSelSort = SelectionSort.selecSort(new int[]{2, 44444, 1, 34, 23, 56, 45, 9});
        System.out.println(Arrays.toString(testSelSort));
    }

    public static void print(int elementKey, int index) {
        if (index == -1) {
            System.out.println(elementKey + " not found.");
        } else {
            System.out.println(elementKey + " found at index: " + index);
        }
    }

}