public class P744_FIndSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] a, char x) { // consfusing problem statement
        int n = a.length;

        //hi starts at 'n' rather than the usual 'n - 1'. 
        //It is because the terminal condition is 'lo < hi' and if hi starts from 'n - 1', 
        //we can never consider value at index 'n - 1'
        int lo = 0, hi = n;

        //Terminal condition is 'lo < hi', to avoid infinite loop when target is smaller than the first element
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] > x)     hi = mid;
            else    lo = mid + 1;                 //a[mid] <= x
        }
 
        //Because lo can end up pointing to index 'n', in which case we return the first element
        return a[lo % n];
    }

    // public static char nextGreatestLetter2(char[] a, char x) {
    //     int left = 0, right = a.length-1;
    //     while ()
    // }
    public static void main(String[] args) {
        char[][][] probs = {
            // {{7, 9, 10, 11, 0, 2, 4, 5}, {12}}
            // {{0, 1, 2, 3, 4}, {8}},
            // {{6, 1, 3, 4}, {9}},
            {{'c', 'f', 'j'}, {'a'}},
            {{'c', 'f', 'j'}, {'c'}},
            {{'c', 'f', 'j'}, {'d'}},
            {{'e', 'g', 'h', 'i', 'a', 'b', 'c', 'd'}, {'f'}},
            {{'e', 'f', 'g', 'h', 'a', 'b', 'c', 'd'}, {'i'}}
        };
        for (char[][] prob: probs) {
            System.out.println(nextGreatestLetter(prob[0], prob[1][0]));
        }
    }
}
