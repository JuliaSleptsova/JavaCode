public class BinarySearch {

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

}
