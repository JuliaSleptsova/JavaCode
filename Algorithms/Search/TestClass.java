public class TestClass {
    public static void main(String[] args) {
        int index1 = BinarySearch.binarySearch(new int[]{1, 33, 45, 123, 897, 1002, 70009}, 89);
        print(89, index1);
        int index2 = LinearSearch.linSearch(new int[]{1, 45, 23, 4, 89, 8}, 4);
        print(index2, 4);
    }

    public static void print(int elementKey, int index) {
        if (index == -1) {
            System.out.println(elementKey + " not found.");
        } else {
            System.out.println(elementKey + " found at index: " + index);
        }
    }
}