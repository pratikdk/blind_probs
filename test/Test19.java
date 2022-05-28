import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        int[] listA = new int[3];
        listA[0] = 10;

        int pos = Arrays.binarySearch(listA, 0, 1, 9);

        System.out.println(pos);
    }
}
