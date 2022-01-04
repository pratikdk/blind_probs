public class Test5 {

    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}
