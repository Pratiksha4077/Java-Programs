import java.util.Arrays;

public class Pra1_5 {
    public static void mergeArrays(int[] arr1, int size1, int[] arr2, int size2, int[] merged) {
        int i = 0, j = 0, k = 0;
        
        while (i < size1) {
            merged[k++] = arr1[i++];
        }
        while (j < size2) {
            merged[k++] = arr2[j++];
        }

	Arrays.sort(merged);
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 3, 6, 1};
        int[] arr2 = {8, 3, 2, 7};
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] merged = new int[size1 + size2];
        
        mergeArrays(arr1, size1, arr2, size2, merged);
        
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
