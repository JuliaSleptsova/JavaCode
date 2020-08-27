public class LinearSearch {
    public static void main(String[] args){
        int index = linSearch(new int[]{1, 45, 23, 4, 89, 8}, 4);
        print(index, 4);
    }
    public static int linSearch(int arr[], int elementKey){
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == elementKey)
                return index;
        }
        return -1;
    }

    public static void print(int index, int elementKey){
        if (index == -1){
            System.out.println(elementKey + " not found.");
        }
        else {
            System.out.println(elementKey + " found at index: " + index);
        }

    }

}


