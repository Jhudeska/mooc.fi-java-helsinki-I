
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int minIndex = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minIndex = index;
        
        for (int i = minIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
