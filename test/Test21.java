import java.util.Arrays;

public class Test21 {
    public static void main(String[] args) {
        char a = 'A';
        char z = 'Z';

        System.out.println((int)a);
        System.out.println((int)z);

        int[] map = new int[26];
        map['A'-'A'] += 1;

        System.out.println(Arrays.toString(map));
    }   
}
