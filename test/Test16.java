public class Test16 {
    public static void main(String[] args) {
        int res = 9;
        res = (int) Math.ceil(res / 2.0);
        //System.out.println(res);

        int outp = find(10, 100);
        System.out.println(outp);
    }

    // static int find(int k, int n){
    //     // Write your code here
    //     int res = (n) + ((k-1)*(n-1)); // res = 9; for sample input
    //     int curr_res = res;
    //     while (true) { // (res*res >= n) { // until matrix is valid; i.e hold every number from 1 to n
    //         curr_res = (int) Math.ceil(res / 2.0)+1;
    //         System.out.println(curr_res);
    //         System.out.println(Math.pow(((curr_res-1)/((k-1)+1))+1, 2));
    //         double capacity = Math.pow(((curr_res-1)/((k-1)+1))+1, 2); 
    //         if (capacity <= n) { // (curr_res*curr_res < n) {
    //             if (capacity == n) res = curr_res;
    //             break;
    //         }
    //         res = curr_res;
    //         // System.out.println(res);
    //     }
    //     return res;
    // }

    static int find(int k, int n){
        // Write your code here
        int res = (n) + ((k-1)*(n-1)); // res = 9; for sample input
        int curr_res = res;
        System.out.println("init res: " + res);
        while (true) { // (res*res >= n) { // until matrix is valid; i.e hold every number from 1 to n
            curr_res = res-(1+(k-1));
            // System.out.println(curr_res);
            // System.out.println(Math.pow(((curr_res-1)/((k-1)+1))+1, 2));
            // double capacity = Math.pow(((curr_res-1)/((k-1)+1))+1, 2);
            double capacity = Math.pow(Math.ceil((double)curr_res/(1+(k-1))), 2);
            //System.out.println(capacity);
            if (capacity <= n) { // (curr_res*curr_res < n) {
                if (capacity == n) res = curr_res;
                break;
            }
            res = curr_res;
            // System.out.println(res);
        }
        return res;
    }


    // static int find(int k, int n){
    //     int res = (n) + ((k-1)*(n-1)); // res = 9; for sample input
    //     int curr_res = res;
    //     while (true) { // (capacity >= n) // runs until matrix is valid; i.e hold every number from 1 to n
    //         curr_res = res-(1+(k-1));
    //         double capacity = Math.pow(Math.ceil((double)curr_res/(1+(k-1))), 2);
    //         if (capacity <= n) { // (curr_res*curr_res < n) {
    //             if (capacity == n) res = curr_res;
    //             break;
    //         }
    //         res = curr_res;
    //     }
    //     return res;
    // }
}
