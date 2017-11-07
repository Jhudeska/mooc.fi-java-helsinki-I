

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array) {
        int[] copyArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        
        return copyArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverseArray = new int[array.length];
        
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        
        return reverseArray;
    }
    
}
