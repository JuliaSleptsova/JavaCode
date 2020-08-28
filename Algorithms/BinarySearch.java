public class BinarySearch {
    public static void main(String[] args){
        int index = binarySearch(new int[]{1, 33, 45, 123, 897, 1002, 70009}, 89);
        print(89, index);
    }
    public static int binarySearch(int arr[], int elementKey) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int midindex = firstIndex + (lastIndex - firstIndex) / 2;
            //int midindex = (lastIndex + firstIndex) / 2;
            if (arr[midindex] == elementKey)
                return midindex;

            else if (arr[midindex] < elementKey)
                firstIndex = midindex + 1;

            else if (arr[midindex] > elementKey)
                lastIndex = midindex - 1;

        }
        return  -1;
    }
    public static void print(int elementKey, int index) {
        if (index == -1){
            System.out.println(elementKey + " not found.");
        }
        else {
            System.out.println(elementKey + " found at index: " + index);
        }
    }
}
