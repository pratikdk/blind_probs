import java.util.Arrays;

public class Test15 {
    public static void main(String[] args){ 
        int[] arr = {1, 2, 4};
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index);
    }
}
