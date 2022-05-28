import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test17 {

    public static int compute() {
        return 100;
    }

    public String makeRandomString() {
        return "" + (int)(Math.random()*10);
    } 
    public static void main(String[] args) {
        Integer d = compute();
        System.out.println(d);

        Test17 t = new Test17();
        System.out.println(t.makeRandomString());


        List<Integer> alist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            alist.add(i);
        }
        System.out.println(alist);

        Iterator<Integer> it = alist.listIterator();
        while (it.hasNext()) {
            Integer x = it.next();
            System.out.println(x);
        }
    }   
}
